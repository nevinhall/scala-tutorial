package com.gv.scala.learning.lists

import scala.annotation.tailrec

object Lists extends App {

  @tailrec
  def last[A](list: List[A]): A = list match {
    //case List.empty[A] =>
    case Nil => throw new NoSuchElementException // empty list
    case head :: Nil => head // single element list
    case _ :: tail => last(tail) //  more than one element
  }


  def noElements[A](list: List[A]): Int = list match {
    case Nil => 0 // empty list
    case _ :: tail => 1 + noElements(tail) // more than one element

  }

  def isPalindrome[A](list: List[A]): Boolean = list match {
    case Nil => false // empty list
    case head :: Nil => true // one element in list
    case head +: newList :+ last =>
      if (head == last && newList.isEmpty == false) {
        isPalindrome(newList)
      } else if (head == last && newList.isEmpty) {
        true
      } else {
        false
      }

  }

  val potList = List[Any]()


  //  @tailrec
  //  def flattenStruct(list: List[Any]) : List[Any] = list  match{
  //    case Nil => list
  //    case _ :: tail => potList match {
  //      case head: List[Any]  =>
  //        head :+ tail
  //      case head if(head != List[Any])=>
  //        flattenStruct(tail)
  //    }
  //  }

  def dupList[A](listToDup: List[A]): List[A] = listToDup match {
    case Nil => Nil
    case head :: tail => head :: head :: dupList(tail)
  }

  def splitList[A](numListElements: Int, list: List[A]): (List[A], List[A]) = numListElements match {
    case 0 => (List(), list)
    case x if (x < 0) => (List(), list)
    case _ => splitList(numListElements - 1, list.tail) match {
      case (left , right) if(right.size == 0) => (list.take(numListElements),left)
      case (left, right) => (( left :+ right.head), right.tail)


    }
  }

def remAtK[A](list: List[A], remIndex: Int): (List[A], Any) = list match {
  case Nil => (List(), 0)
  case head :: tail if(list.size != remIndex)  => remAtK(tail,remIndex)match {
    case (x, head :: rem) if(list.size == remIndex)  => (list.take(list.size - remIndex) ++ rem, x.head)
  }

}









  //  flattenStruct(List(List(1),2))
  isPalindrome(List(1, 2, 3, 2, 2))
  //packChar(List('a','b','a'))


}

//
//case head if(head.head.equals(tempList.head)) => tempList :+ remList.head
//case _ => compareLists(tempList, remList)



package com.gv.scala.learning.lists

import scala.annotation.tailrec

object Lists extends App{

  @tailrec
  def last[A](list: List[A]): A = list match {
    //case List.empty[A] =>
    case Nil => throw new NoSuchElementException // empty list
    case head :: Nil => head // single element list
    case _ :: tail =>  last(tail) //  more than one element
  }


  def noElements[A](list: List[A]) : Int = list match {
    case Nil => 0 // empty list
    case _ :: tail => 1 + noElements(tail)  // more than one element

  }

  def isPalindrome[A](list: List[A]) : Boolean = list match {
    case Nil => false // empty list
    case head :: Nil => true  // one element in list
    case head +:newList:+ last =>
      if(head == last && newList.isEmpty == false) {
        isPalindrome(newList)
      }else if(head == last && newList.isEmpty){K
      }else{
        false
      }

  }

  val potList = List[Any]()

//  @tailrec
//  /** Flattens a possible nested list
//   * @param  list possible nested list, with elements of any type
//   * @return a flat list, with all elements of the nested argument in the same order
//   * */
//  def flattenStruct(list: List[Any]) : List[Any] = list  match{
//    case Nil => Nil
//    case headb:: tail => list match {
//      case head: list  =>
//        head + tail
//      case _ =>
//        flattenStruct(tail)
//    }
//  }

//  def packChar[A](list: List[A]) : List[List[A]] = list  match{
//    case Nil => Nil
//    case head :: tail =>  compareLists(List(List(head)),tail)
//  }

//  def compareLists[A](tempList: List[List[A]] , remList: List[A]) : List[List[A]] = remList match {
//    case firstTailElement :: if(firstTailElement.head == tempList.head) => compareLists(List(tempList :+ firstTailElement.head),remList)
//
//      //1. get the first element add it to a list
//      //2. with the previous list made, we want to check if element 0 is equl to the first element in the tail
//          //if true:
//                  // we need to append the first list to include the new element, then re- run compare method with new lists
//          //if false
//                // seperate remlist into head and tail and pass into compare method
//
//  }

  //@scala.annotation.tailrec
  def dupList[A](list: List[A]): List[A] = list match{
    case Nil => Nil
    case ele1 :: tail => ele1 match {
      case ele2 :: tail => if(ele2 == ele1){ dupList(tail)}
      case _ => ele1 +: list
    }
    case _ => list



  }





//  flattenStruct(List(List(1),2))
  isPalindrome(List(1,2,3,2,2))
  //packChar(List('a','b','a'))

}










//
//case head if(head.head.equals(tempList.head)) => tempList :+ remList.head
//case _ => compareLists(tempList, remList)



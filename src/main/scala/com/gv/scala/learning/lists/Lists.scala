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
      if(head == last) {
        isPalindrome(newList)
        println("true")
        true
      }else
        print("false")
        false
  }

  isPalindrome(List(1,2,3,2,2))

}





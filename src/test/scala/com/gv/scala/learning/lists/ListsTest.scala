package com.gv.scala.learning.lists

import org.scalatest.wordspec.AnyWordSpec

class ListsTest extends AnyWordSpec {
  "A list" when {
    "contains a single element" should {
      "return its element as the last element" in {
        assertResult('b')(Lists.last('b' :: Nil))
      }
    }
    "not empty" should {
      "yield the last element as requested" in {
        assertResult(5)(Lists.last(List(1, 2, 3, 4, 5)))
        assertResult("b")(Lists.last(List("a", "b")))
      }
    }
    "empty" should {
      "throw a NoSuchElementException when the last element is requested" in {
        assertThrows[NoSuchElementException](Lists.last(List()))
      }
    }
  }
  "A palindrome list" when {
    "contains a single element" should {
      "return true" in {
        assertResult(true)(Lists.isPalindrome(1 :: Nil))
      }
    }
    "when there is two elements and they are eqaul" should {
      "return true" in {
        assertResult(true)(Lists.isPalindrome(List(1, 1)))
      }
    }
    "when there is two elements and they are not eqaul" should {
      "return false" in {
        assertResult(false)(Lists.isPalindrome(List(1, 2)))
      }
    }
    "when there is more than two elements and they are not eqaul" should {
      "return false" in {
        assertResult(false)(Lists.isPalindrome(List(1, 2, 3, 1, 3)))
      }
    }
    "when there is more than two elements and they are ` eqaul" should {
      "return false" in {
        assertResult(true)(Lists.isPalindrome(List(1, 2, 3, 2, 1)))
      }
    }
  }
  "is flattened" should {
    "return an empty list if empty" in {
      assertResult(List())(Lists.flattenStruct((List())))
    }
    "return a unflattened list" in {
      assertResult(List(1, 2, 3))(Lists.flattenStruct((List(1, List(2, List(3))))))
      assertResult(List(1, 2, 3))(Lists.flattenStruct((List(List(1, List(2, List(3)))))))
      assertResult(Nil)(Lists.flattenStruct((List(List(List())))))
    }
  }


}



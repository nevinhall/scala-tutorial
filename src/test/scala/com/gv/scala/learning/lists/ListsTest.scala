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
    "given an n value and list" should{
      "return a tuple containining a list of size n and the remainder of the list" in {
        assertResult((List(1,2,3),List(4,5)))(Lists.splitList(3,List(1,2,3,4,5)))
      }
      "return a a list minus the nth element and the nth element" in{
        assertResult(((List(1,2,3,5),4)))(Lists.remAtK(List(1,2,3,4,5),3))

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
    "when given unique characters " should{
      "return duplicates" in {
        assertResult(List('a','a','b','b','c','c'))(Lists.dupList(List('a','b','c')))
      }
    }


  }
//  "is flattened" should {
//    "return an empty list if empty" in {
//      assertResult(List())(Lists.flattenStruct((List())))
//    }
//    "return a unflattened list" in {
//      assertResult(List(1, 2, 3))(Lists.flattenStruct((List(1, List(2, List(3))))))
//      assertResult(List(1, 2, 3))(Lists.flattenStruct((List(List(1, List(2, List(3)))))))
//      assertResult(Nil)(Lists.flattenStruct((List(List(List())))))
//    }
//  }

//  "char packed" should {
//    "return an empty list if empty" in {
//      assertResult(List())(Lists.packChar((List())))
//    }
//    "return multiple list" in {
//      assertResult(List(List('a'), List('b'), List('c')))(Lists.packChar(List('a','b','c')))
//
//    }
//    "return one list with multiple of the same char  " in {
//      assertResult(List('a','a'))(Lists.compareLists(List('a'),List('a','b','a')))
//
//    }
//  }
//  "A list of symbols" when {
//    "full" should {
//      "return a packed list" in {
//        assertResult(
//          List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
//        )(
//          Lists.packChar(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//        )
//      }
//    }
//    "empty" should {
//      "return an empty list" in {
//        assert(Lists.packChar(List()).isEmpty)
//      }
//    }
//  }







}



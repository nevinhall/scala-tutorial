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
}


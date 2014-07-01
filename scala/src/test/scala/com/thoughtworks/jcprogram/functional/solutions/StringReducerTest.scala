package com.thoughtworks.jcprogram.functional.solutions

import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit

class StringReducerTest extends AssertionsForJUnit {
  var numbers = Seq[Int]()
  var computer = new SquareRootComputer()
  
  @Test def shouldTakeSquareRootOfAllNumbers {
    numbers = Seq(9, 16)
    numbers.foreach(println)
    val result: String = computer.compute(numbers)
    assertThat(result, both(containsString("3")).and(containsString("4")))
  }

  @Test def shouldSeparateNumbersWithCommaAndSpace {
    numbers = Seq(9, 9)
    val result: String = computer.compute(numbers)
    assertThat(result, is("3, 3"))
  }

  @Test def shouldReportNothingWhenNumberIs4 {
    numbers = Seq(4)
    val result: String = computer.compute(numbers)
    assertThat(result, is(""))
  }
}
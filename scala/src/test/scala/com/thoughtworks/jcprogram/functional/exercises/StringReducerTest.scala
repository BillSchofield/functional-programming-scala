package com.thoughtworks.jcprogram.functional.exercises

import org.hamcrest.CoreMatchers._
import org.junit.Assert._
import org.junit.{Before, Test}
import org.scalatest.Ignore
import org.scalatest.junit.AssertionsForJUnit

class StringReducerTest extends AssertionsForJUnit {
  var numbers = Seq[Int]()
  var computer = new SquareRootComputer()
  
  @Ignore
  @Test def shouldTakeSquareRootOfAllNumbers {
    numbers = Seq(9, 16)
    numbers.foreach(println)
    val result: String = computer.compute(numbers)
    assertThat(result, both(containsString("3")).and(containsString("4")))
  }

  @Ignore
  @Test def shouldSeparateNumbersWithCommaAndSpace {
    numbers = Seq(9, 9)
    val result: String = computer.compute(numbers)
    assertThat(result, is("3, 3"))
  }

  @Ignore
  @Test def shouldReportNothingWhenNumberIs4 {
    numbers = Seq(4)
    val result: String = computer.compute(numbers)
    assertThat(result, is(""))
  }
}
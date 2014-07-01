package com.thoughtworks.jcprogram.functional.exercises

import org.hamcrest.CoreMatchers._
import org.junit.Assert._
import org.junit.{Ignore, Test}
import org.scalatest.junit.AssertionsForJUnit

class SquareRootComputerTest extends AssertionsForJUnit {
  var computer = new SquareRootComputer()

  @Ignore
  @Test def shouldTakeSquareRootOfAllNumbers {
    val result: String = computer.compute(Seq(9, 16))
    assertThat(result, both(containsString("3")).and(containsString("4")))
  }

  @Ignore
  @Test def shouldSeparateNumbersWithCommaAndSpace {
    assertThat(computer.compute(Seq(9, 9)), is("3, 3"))
  }

  @Ignore
  @Test def shouldReportNothingWhenNumberIs4 {
    assertThat(computer.compute(Seq(4)), is(""))
  }
}
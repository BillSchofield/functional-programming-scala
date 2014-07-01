package com.thoughtworks.jcprogram.functional.solutions

import org.hamcrest.CoreMatchers._
import org.junit.Assert._
import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit

class StringReducerTest extends AssertionsForJUnit {
  var reducer: StringReducer = new StringReducer

  @Test def shouldReduceAllStrings {
    assertThat(reducer.reduce(Set("1234", "2345")), is("12"))
  }

  @Test def shouldReduceToNothingWhenStringIsNotLength4 {
    assertThat(reducer.reduce(Set("12345")), is(""))
  }
}
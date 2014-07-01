package com.thoughtworks.jcprogram.functional.exercises

import org.hamcrest.CoreMatchers._
import org.junit.Assert._
import org.junit.{Ignore, Test}
import org.scalatest.junit.AssertionsForJUnit

class StringReducerTest extends AssertionsForJUnit {
  var reducer: StringReducer = new StringReducer

  @Ignore
  @Test def shouldReduceAllStrings {
    assertThat(reducer.reduce(Set("1234", "2345")), is("12"))
  }

  @Ignore
  @Test def shouldReduceToNothingWhenStringIsNotLength4 {
    assertThat(reducer.reduce(Set("12345")), is(""))
  }
}
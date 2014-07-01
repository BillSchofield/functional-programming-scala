package com.thoughtworks.jcprogram.functional.exercises

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

class SquareRootComputer {
  def compute(numbers: Seq[Int]) : String = {
    numbers.filter(number => number > 4).map(number => math.sqrt(number.doubleValue()).toInt).mkString(", ")
  }
}

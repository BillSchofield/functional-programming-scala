package com.thoughtworks.jcprogram.functional.exercises

object Main {

  def main(args: Array[String]) {
    val strings = Set("Bill", "Archer", "Lana")
    val reducer = new StringReducer()
    println(reducer.reduce(strings))

    val numbers = Seq(1, 9, 4, 16, 4)
    val computer = new SquareRootComputer()
    println(computer.compute(numbers))
  }
}

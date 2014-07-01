package com.thoughtworks.jcprogram.functional.solutions

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

class StringReducer {
  def reduce(strings: Set[String]) : String = {
    strings.filter(string => string.length == 4).map(string => string.charAt(0)).mkString("")
  }
}

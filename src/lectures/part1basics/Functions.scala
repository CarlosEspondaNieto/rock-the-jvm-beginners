package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction("helllo", 3))

  // a Function paremeterless can be called without parentheses
  def aParemeterlessFunction(): Int = 42
  println(aParemeterlessFunction())
  println(aParemeterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  //WHEN YOU NEED LOOPS, USE RECURSION.
  //The worst is to write imperative code in scala syntax

}

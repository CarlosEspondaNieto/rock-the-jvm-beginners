package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ...side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (Value)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while(i<10){
    println(i)
    i += 1
  }

  //Everything in Scala is an expression!

  val aWeirdValue = (aVariable = 3)//Unit == void
  println(aWeirdValue)

  //side effects: println(), reassigning, while.

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y +1

    if (z > 2) "hello" else "goodbye"
  }
  // Things to learn:
  // Code blocks in Scala are expressions
  // the value of the block is the value of its last expression
  // everything you define inside the code block is visible inside the code block not outside


}

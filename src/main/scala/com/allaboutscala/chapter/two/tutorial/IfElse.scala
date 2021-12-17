package com.allaboutscala.chapter.two.tutorial

object IfElse extends App {

  println("IF ELSE");

  val numberOfPeople = 11;
  val donutsPerPerson : Int = 2;
  val defaultDonutsToBuy = 1;

  println("\nStep 1: Using if, else if, and else clause as a statement")
  if(numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }

  println("\nStep 2: Using if and else clause as expression")
  val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy 2 = $numberOfDonutsToBuy")

}

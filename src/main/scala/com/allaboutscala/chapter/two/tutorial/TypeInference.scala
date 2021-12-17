package com.allaboutscala.chapter.two.tutorial

object TypeInference extends App{

  println("Type Inference ")
  println("Step 1: Immutable variable")
  val donutsToBuy: Int = 5
  println("Donnot to Buy "+donutsToBuy)
  val donutsBought = 5
  println("donutsBought  "+donutsBought)

  println("\nStep 2: Scala Types")
  val donutsBoughtToday = 5
  val bigNumberOfDonuts = 100000000L
  val smallNumberOfDonuts = 1
  val priceOfDonut = 2.50
  val donutPrice = 2.50f
  val donutStoreName = "Allaboutscala Donut Store"
  val donutByte = 0xa
  val donutFirstLetter = 'D'
  val nothing = ()

  println("\nStep 3: Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts

  //Converting from a Short to an Int was fine because there was no precision loss, i.e. an Int is larger than a Short.
  println("minimumDonutsToBuy "+minimumDonutsToBuy)

  println("\nStep 4: User driven conversion from one data type to another ")

  val minimumDonutsToSell: String = numberOfDonuts.toString()
  println("minimumDonutsToSell "+minimumDonutsToSell)
}

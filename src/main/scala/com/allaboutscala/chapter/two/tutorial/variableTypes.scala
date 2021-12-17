package com.allaboutscala.chapter.two.tutorial

object variableTypes extends App {

  println("Variable Types ")

  val fruitName : String = "Apple";
  println("Value immutable fruit "+fruitName)

  var vegName : String ="Beans"
  vegName = "carrot"
  println("Value mutable veg "+vegName)

  lazy val game ="Cricket and Football"
  println("Scala knew this is type inference as string "+game)

  var variableDeclare : String = _;
  println("Variable Declare "+variableDeclare)
  variableDeclare="Hello"
  println("Variable Declare "+variableDeclare)

  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

}

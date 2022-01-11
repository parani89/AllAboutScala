package com.allaboutscala.chapter.two.tutorial

object PatternMatching extends App{

  println("Inside Pattern Matching")

  val flavour = "vannila";

  flavour match {
    case "strawberry" => println("Strawberry")
    case "vannila" => println("Vannila")
    case _ => println("default")
  }

  var tasteLevel = flavour match {
    case "strawberry" => "Tasty"
    case "vannila" => "Very Tasty"
  }

  println("The taste level is "+tasteLevel)

  var tasteLevel2 = flavour match {
    case "strawberry" | "vannila" => "Tasty"
    case "butter" => "Very Tasty"
  }

  println("The taste level2 is "+tasteLevel2)

  val priceOfDonut : Any = 2.50
  val priceType = priceOfDonut match {
    case price: Int => "Int"
    case price: Double => "Double"
    case price: Float => "Float"
    case price: String => "String"
    case price: Boolean => "Boolean"
    case price: Char => "Char"
    case price: Long => "Long"
  }
  println(s"Donut price type = $priceType")
}

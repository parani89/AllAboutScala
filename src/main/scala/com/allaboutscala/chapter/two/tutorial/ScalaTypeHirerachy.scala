package com.allaboutscala.chapter.two.tutorial

object ScalaTypeHirerachy extends App {

  println("Inside ScalaType ")

  val favoriteDonut: Any = "Glazed Donut"
  println(s"favoriteDonut of type Any = $favoriteDonut")

  val donutName: AnyRef = "Glazed Donut"
  println(s"donutName of type AnyRef = $donutName")

  val donutPrice: AnyVal = 2.50
  println(s"donutPrice of type AnyVal = $donutPrice")


}

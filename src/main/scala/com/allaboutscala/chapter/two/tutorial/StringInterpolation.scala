package com.allaboutscala.chapter.two.tutorial

object StringInterpolation extends App {

  println("String Interpolation");

  println("===== Step 1 ======");
  val favDonut : String = "Choco Donnut";
  println(s"My favorite donut is ${favDonut}");

  println("===== Step 2 Object properties ======");
  case class Donut(name:String,taste:String);

  val favDonut2 : Donut = Donut("Hazzelnut ","very tasty")
  println(s"My favorite 2 donnut is ${favDonut2.name} and it's ${favDonut2.taste}")

  println("=== Step 3 valuation ====")
  val totalAvailable : Int = 10;
  println(s"Validation is ${totalAvailable == 11}")

  println("=== Step 4 formatting ====")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")

  println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice: Double = 2.5
  println(s"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.2f")

}

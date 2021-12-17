package com.allaboutscala.chapter.two.tutorial

object Comprehension extends App {

  println("Comprehension")

  println("1. Simple loop ")
  for(iterator <- 1 to 5) {
    println(s" Value is ${iterator}")
  }

  println("2. Simple loop Until")
  for(iterator <- -5 until 5) {
    println(s" Value is ${iterator}")
  }

  println("3. Filter using If condition")
  val names = List ("Hello","Parani","Rajan");

  for(name <- names) {
    if (name == "Parani") {
      println("Found Name")
    }
  }

  println("4. Filter using If condition another ")
  val names1 = List ("Hello","Parani","Rajan");

  for(name <- names1 if (name == "Parani")) {
      println("Found Name1");
  }

  println("5. Filter using If condition another yield")
  val names2 = List ("Hello","Parani","Rajan");

  val finalName = for(name <- names1 if (name == "Parani" || name == "Rajan"))  yield name;
  println(s"Final Name ${finalName}")

  println("5. Two Dimention")
  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugar"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"

  for ( x <- 0 until 2; y <- 0 until 2) {
    println(s"Values in two twoDimensionalArray array ${(x,y)} is ${twoDimensionalArray(x)(y)}")
  }
}

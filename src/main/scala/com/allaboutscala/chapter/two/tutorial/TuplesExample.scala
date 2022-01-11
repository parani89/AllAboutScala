package com.allaboutscala.chapter.two.tutorial

object TuplesExample extends App {

  println("Inside Tuple examples")

  println("Tuples2")
  val vannilaDonutTuple = Tuple2("vannila", "Tasty")
  println("Tuples2 " + vannilaDonutTuple._1 + " Level is " + vannilaDonutTuple._2)
  println("Tuples2 total " + vannilaDonutTuple)

  println("Tuples3")
  val strawberryTuple = Tuple3("strawberry", "very Tasty", 5.6)
  println("Tuple3 " + strawberryTuple)
  val name = strawberryTuple._1;
  val level = strawberryTuple._2;
  val price = strawberryTuple._3;
  println("Name is " + name + " level is " + level + " price is " + price)

  val lemonTuple = Tuple3("lemon", "Tasty", 2.6)
  val appleuple = Tuple3("apple", "Tasty", 2.6)

  val donutList = List(strawberryTuple, lemonTuple, appleuple);

  donutList.foreach { tupleInside => {
    tupleInside match {
      case ("apple", "Tasty", 2.6) => println("Case 1 Apple")
      case localVaribale if localVaribale._1.contains("lemn") => println("Case 2 lemon")
      case _ => println("Default")
    }
  }

    println("Another way to create Tuple")
    val chocoleteDonut = ("Choco","Normal",3,4)
    println(s"${chocoleteDonut._1}")
  }
}

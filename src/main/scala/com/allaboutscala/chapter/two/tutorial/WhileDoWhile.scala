package com.allaboutscala.chapter.two.tutorial

object WhileDoWhile extends App{

  println("Inside while and doWhile")

  var counter = 5
  println("While print")
  while (counter > 0) {
    println("while "+counter)
    counter -=1;
  }

  println("Do while ")
  val counter1 =0;
  do {
    println("Do while print "+counter1)
  } while (counter1 >0)
}

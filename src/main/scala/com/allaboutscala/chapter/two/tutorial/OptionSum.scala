package com.allaboutscala.chapter.two.tutorial

object OptionSum extends App {

  println("Inside OptionSum")

  val gazelnutDonut : Option[String] = Some("Very Tasty");
  val gazelnutDonut1 : Option[String] = None;
  println("Option output is "+gazelnutDonut.get);
  println("Option output1 is "+gazelnutDonut1.getOrElse("NONE_TEST"));

  gazelnutDonut1 match {
    case Some(name) => println(s"Received donut name = $name")
    case None       => println(s"No donut name was found!")
  }

}

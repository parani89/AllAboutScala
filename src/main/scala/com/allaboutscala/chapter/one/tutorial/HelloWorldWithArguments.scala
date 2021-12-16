package com.allaboutscala.chapter.one.tutorial

object HelloWorldWithArguments extends App{
  print("Hello With Arguments ");
  println;
  args.foreach(println)
  println;
  println("====== Printing with mkString =======");
  println(args.mkString("#"));
}

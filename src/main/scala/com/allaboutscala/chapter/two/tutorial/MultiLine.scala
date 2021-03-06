package com.allaboutscala.chapter.two.tutorial

object MultiLine extends App{

  println("Multiline ")
  println("Step 1: How to escape a Json String")
  //val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"

  println("\nStep 2: Using backslash to escpae quotes")
  val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(donutJson2)

  val donutJson3 = "{donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(donutJson3)

  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJson4: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson4 = $donutJson4")

  println("\nStep 4: Create multiLine using StripMargin")
  val donutJson5: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
      """
      .stripMargin;

  println(donutJson5);
}

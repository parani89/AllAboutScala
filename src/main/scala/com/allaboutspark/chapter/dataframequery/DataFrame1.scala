package com.allaboutspark.chapter.dataframequery

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession

object DataFrame1 extends App with Context{

  println("Hello")
  val dataframe = spark.read.format("csv").load("file:///E:/Hadoop/Hadoop_Data/Format_files/usdata.csv")
  dataframe.show(4);

}

trait Context {

  lazy val conf = new SparkConf()
    .setAppName("Learn Spark")
    .setMaster("local[*]")
    .set("spark.cores.max", "2");

  val sc = new SparkContext(conf);
  sc.setLogLevel("ERROR");

  lazy val spark = SparkSession
    .builder().config(conf)
    .getOrCreate();

  import spark.implicits._;

}
name := "Scala1"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.3",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

libraryDependencies ++= Seq(
  "org.apache.spark"  %%  "spark-core"    % "2.3.0"   % "provided",
  "org.apache.spark"  %%  "spark-sql"     % "2.3.0",
  "org.apache.spark"  %%  "spark-mllib"   % "2.3.0"
)
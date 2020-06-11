name := "sparkex1"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.databricks" % "dbutils-api_2.11" % "0.0.3",
  "org.apache.spark" %% "spark-core" % "2.2.0",
  "org.apache.spark" %% "spark-sql" % "2.2.0",
  "org.apache.hadoop" % "hadoop-azure" % "2.7.3"
)
//libraryDependencies += "com.databricks" %% "dbutils-api" % "0.0.1"
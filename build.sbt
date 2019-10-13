name := "aws-lambda-scala"


val scalaV212 = "2.12.4"
scalaVersion := scalaV212

scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation")


libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.2.0"

libraryDependencies += "com.amazonaws" % "aws-lambda-java-events" % "2.2.2"

organization := "com.example"

name := "Simple"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scala-lang"    % "scala-reflect"       % scalaVersion.value,
  "org.scala-lang"    % "scala-compiler"      % scalaVersion.value,
  "org.scala-lang"    % "scala-library"       % scalaVersion.value,
  "org.specs2" %% "specs2-core" % "3.8.4" % "test",
  "org.specs2" %% "specs2-scalacheck" % "3.8.4" % "test",
  "org.specs2" %% "specs2-mock" % "3.8.4" % "test",
  "org.specs2" %% "specs2-matcher-extra" % "3.8.4" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

mainClass in (Compile, run) := Some("com.example.Simple")
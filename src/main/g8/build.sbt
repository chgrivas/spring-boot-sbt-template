import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.12"
    )),
    libraryDependencies ++= springBootDependencies,
    name := "spring-boot"
  )

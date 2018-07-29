import Dependencies._

enablePlugins(JavaAppPackaging)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.$organization;format="package"$",
      scalaVersion := "2.12.6"
    )),
    libraryDependencies ++= springBootDependencies,
    name := "spring-boot",
    scriptClasspath := Seq("*"),
    mainClass in Compile := Some("com.$organization;format="package"$.$name$.Application")
  )

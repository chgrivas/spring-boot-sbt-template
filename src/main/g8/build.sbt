import Dependencies._


enablePlugins(JavaAppPackaging)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6"
    )),
    libraryDependencies ++= springBootDependencies,
    name := "spring-boot",
    scriptClasspath := Seq("*"),
    mainClass in Compile := Some("com.organization.name.main.MainApp")
  )

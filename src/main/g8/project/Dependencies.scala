import sbt._

object Dependencies {
  // Versions
  lazy val springBootVersion = "2.0.0.RELEASE"

  // Libraries
  val springBootStarterWeb    = "org.springframework.boot" % "spring-boot-starter-web" % springBootVersion

  // Projects
  val springBootDependencies =
    Seq(springBootStarterWeb)
}

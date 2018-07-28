import sbt._

object Dependencies {
  // Versions
  lazy val springBootVersion = "2.0.0.RELEASE"

  // Libraries
  val springBootStarterJersey    = "org.springframework.boot" % "spring-boot-starter-jersey" % springBootVersion

  // Projects
  val springBootDependencies =
    Seq(springBootStarterJersey)
}

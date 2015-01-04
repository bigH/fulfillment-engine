import sbt._

object Libraries {
  object main {
    object guice {
      lazy val core = "com.google.inject" % "guice" % Versions.guice
    }
  }

  object test {
    def inTest(module: ModuleID) = module % "test"

    lazy val scalatest = inTest("org.scalatest" %% "scalatest" % Versions.scalatest)
    lazy val scalacheck = inTest("org.scalacheck" %% "scalacheck" % Versions.scalacheck)
  }
}

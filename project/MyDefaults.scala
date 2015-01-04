import sbt._
import Keys._
import net.virtualvoid.sbt.graph.{Plugin => GraphPlugin}
import de.johoop.cpd4sbt.CopyPasteDetector
import de.johoop.jacoco4sbt._
import JacocoPlugin._

object MyDefaults {
  lazy val settings =
    Defaults.coreDefaultSettings ++
      groups.mavenSettings ++
      groups.pluginSettings ++
      groups.scalacSettings ++
      groups.resolverSettings ++
      groups.librarySettings

  object groups {
    lazy val mavenSettings =
      Seq (
        organization := "com.angieslist",
        version      := Versions.mine,

        scalaVersion := Versions.scala
      )

    lazy val pluginSettings =
        CopyPasteDetector.cpdSettings ++
        jacoco.settings ++
        GraphPlugin.graphSettings

    lazy val scalacSettings =
      Seq (
        scalacOptions ++= Seq (
          "-feature",
          "-unchecked",
          "-deprecation"
        )
      )

    lazy val resolverSettings =
      Seq (
        resolvers ++= Seq (
          DefaultMavenRepository,
          JavaNet1Repository,
          Resolver.sonatypeRepo("releases"),
          Resolver.typesafeRepo("releases"),
          Resolver.typesafeIvyRepo("releases")
        )
      )

    lazy val librarySettings =
      Seq (
        libraryDependencies ++= libraries.test,
        libraryDependencies ++= libraries.compile
      )
  }

  object libraries {
    lazy val test = {
      import Libraries.test._

      Seq (
        scalatest,
        scalacheck
      )
    }

    lazy val compile = {
      import Libraries.main._

      Seq (
        guice.core
      )
    }
  }
}

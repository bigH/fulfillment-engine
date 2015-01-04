import sbt._
import Keys._
import Modules._

object RootModule {

  lazy val project = Project (
    id = Names.project,
    base = file("."),
    settings = moduleSettings
  ) aggregate (
    adapter,
    api,
    implAngies,
    implDrools,
    implSf
  )

  val moduleSettings =
    MyDefaults.settings ++ Seq (
      name := Names.project
    )
}

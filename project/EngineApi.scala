import sbt._
import Keys._
import Modules._
import Libraries._

object EngineApi extends BaseModule("api") {
  val settings = Seq ()

  def project = baseProject dependsOn common

  lazy val libraries = Seq ()
}

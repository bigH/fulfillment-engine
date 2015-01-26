import sbt._
import Keys._
import Modules._
import Libraries._

object EngineAdapter extends BaseModule("adapter") {
  val settings = Seq ()

  def project = baseProject dependsOn (api, model)

  lazy val libraries = Seq ()
}

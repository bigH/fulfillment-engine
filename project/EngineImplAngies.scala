import sbt._
import Keys._
import Modules._
import Libraries._

object EngineImplAngies extends BaseModule("impl-angies") {
  val settings = Seq ()

  def project = baseProject dependsOn (api)

  lazy val libraries = Seq ()
}

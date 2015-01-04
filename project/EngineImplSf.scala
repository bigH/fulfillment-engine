import Modules._
import sbt._


object EngineImplSf extends BaseModule("impl-sf") {
  val settings = Seq ()

  def project = baseProject dependsOn (api)

  lazy val libraries = Seq ()
}

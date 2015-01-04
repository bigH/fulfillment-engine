import Modules._
import sbt._

object EngineImplDrools extends BaseModule("impl-drools") {
  val settings = Seq ()

  def project = baseProject dependsOn (api)

  lazy val libraries = Seq ()
}

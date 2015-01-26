import sbt._
import Keys._
import Modules._
import Libraries._

object EngineModel extends BaseModule("model") {
  val settings = Seq ()

  def project = baseProject

  lazy val libraries = Seq ()
}


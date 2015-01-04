import sbt._
import Keys._
import Modules._
import Libraries._

object EngineCommon extends BaseModule("common") {
  val settings = Seq ()

  def project = baseProject

  lazy val libraries = Seq ()
}


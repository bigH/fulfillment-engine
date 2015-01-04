import sbt._
import Keys._
import Modules._
import Libraries._

object EngineApi extends BaseModule("api") {
  val settings = Seq ()

  def project = baseProject

  lazy val libraries = Seq ()
}

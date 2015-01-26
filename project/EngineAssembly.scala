import sbt._
import Keys._
import Modules._
import Libraries._

object EngineAssembly extends BaseModule("assembly") {
  val settings = Seq ()

  def project = baseProject

  lazy val libraries = Seq ()
}

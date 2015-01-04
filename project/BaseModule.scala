import sbt._
import Keys._

abstract class BaseModule(myName: String) {
  private val n = Namers

  val moduleName = n.name(myName)
  val location = n.directory(myName)

  lazy val moduleSettings = baseSettings ++ settings

  def settings: Seq[Setting[_]]

  lazy val baseSettings =
    MyDefaults.settings ++
    Seq (
      name := moduleName
    ) ++ Seq (
      libraryDependencies ++= libraries,
      libraryDependencies ++= MyDefaults.libraries.compile,
      libraryDependencies ++= MyDefaults.libraries.test
    )

  def libraries: Seq[ModuleID]

  def baseProject = Project (
    id = moduleName,
    base = file(location),
    settings = moduleSettings
  )

  def project: Project

}

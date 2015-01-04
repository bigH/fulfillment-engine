import sbt._

object Modules extends Build {
  lazy val root = RootModule.project

  lazy val common = EngineCommon.project

  lazy val adapter = EngineAdapter.project

  lazy val api = EngineApi.project

  lazy val implAngies = EngineImplAngies.project
  lazy val implDrools = EngineImplDrools.project
  lazy val implSf = EngineImplSf.project
}

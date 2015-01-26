import sbt._

object Modules extends Build {
  lazy val root = RootModule.project

  lazy val adapter = EngineAdapter.project

  lazy val model = EngineModel.project
  lazy val api = EngineApi.project

  lazy val implAngies = EngineImplAngies.project
  lazy val implDrools = EngineImplDrools.project
  lazy val implSf = EngineImplSf.project

  lazy val assembly = EngineAssembly.project
}

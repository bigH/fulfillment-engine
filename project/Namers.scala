object Namers {
  def name(moduleName: String) = Names.project + "-" + moduleName
  def directory(moduleName: String) = "./" + moduleName
}

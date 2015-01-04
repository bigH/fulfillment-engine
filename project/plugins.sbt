resolvers ++= Seq (
  Resolver.typesafeIvyRepo("releases"),
  Resolver.sbtPluginRepo("releases")
)

// runs copy-paste detector
addSbtPlugin("de.johoop" % "cpd4sbt" % "1.1.5")

// coverage
addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")

// supports `dependency-tree` task to inspect dependencies
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

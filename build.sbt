sbtPlugin := true

organization := "com.typesafe.sbt"

name := "sbt-web"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-deprecation", "-feature")

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.2",
  "org.webjars" % "webjars-locator" % "0.19",
  "org.specs2" %% "specs2" % "2.3.11" % "test",
  "junit" % "junit" % "4.11" % "test"
  )

publishMavenStyle := false

publishTo := {
  if (isSnapshot.value) Some(Classpaths.sbtPluginSnapshots)
  else Some(Classpaths.sbtPluginReleases)
}

scriptedSettings

scriptedLaunchOpts += "-Dproject.version=" + version.value

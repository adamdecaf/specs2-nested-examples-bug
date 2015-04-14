name := "specs2-nested-examples-bug"

scalaVersion := "2.11.6"

crossScalaVersions ++= Seq("2.10.5", "2.11.6")

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  // "org.specs2" %% "specs2" % "2.4.2" % "test"
  "org.specs2" %% "specs2-core" % "3.4" % "test"
)

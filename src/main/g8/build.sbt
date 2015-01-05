name := "$name$"

organization := "$organization$"

version := "$version$"

scalacOptions := Seq("-encoding", "utf8", "-target:jvm-1.6")

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

resolvers ++= Seq(
    "imagej.releases" at "http://maven.imagej.net/content/repositories/releases",
    "imagej.snapshots" at "http://maven.imagej.net/content/repositories/snapshots",
    "imagej.public" at "http://maven.imagej.net/content/groups/public"
)

libraryDependencies ++= Seq (
    "net.imagej" % "imagej" % "latest.integration",
    "org.scijava" % "scripting-scala" % "0.1.0-SNAPSHOT"
)

enablePlugins(SbtImageJ)
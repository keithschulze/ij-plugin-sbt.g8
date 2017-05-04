// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      //organization := "$organization$",
      scalaVersion := "2.12.1"
    )),
    name := "$name$",
    version := "$version$",
    organization := "$organization$",
    scalacOptions ++= List(
      "-deprecation",
      "-encoding",
      "UTF-8"
    ),
    resolvers ++= Seq(
      "imagej.public" at "http://maven.imagej.net/content/groups/public"
    ),
    libraryDependencies ++= Seq(
      "net.imagej"    % "imagej"                % "2.0.0-rc-59"   % "provided",
      "net.imagej"    % "imagej-legacy"         % "0.23.5"        % "provided",
      "org.scijava"   % "scripting-scala"       % "0.2.0"         % "provided"
    ),
    mainClass in (Compile, run) := Some("net.imagej.Main"),
    fork in run := true,
    javaOptions ++= Seq("-Xmx4G"),//, "-Dscijava.log.level=debug"),
    test in assembly := {},
    assemblyJarName in assembly := "$name$.jar",
    assemblyOption in assembly := (assemblyOption in assembly).value
      .copy(includeScala = false),
    run in Compile <<= Defaults.runTask(fullClasspath in Compile,
                                        mainClass in (Compile, run),
                                        runner in (Compile, run))
  )

# Giter8 template for creating ImageJ2 plugins in Scala

## Requirements

- SBT version 0.13.13 or above

## Basic Usage
To setup an SBT project for a new ImageJ2 plugin is as easy as:

```
sbt new keithschulze/ij-plugin-sbt.g8
```

You'll be prompted for some information about the plugin you want to develop.
`sbt new` will then scaffold a basic ImageJ2 plugin SBT project. The project
can be tested right away using:

```
sbt run
```

In fact, this provides a nice workflow for developing your plugin. Any time you
want to test your Plugin just `sbt run`.

If you project only depends on ImageJ libraries you can build a simple JAR file
for your Plugin by running:

```
sbt package
```

Note, you will need to add any ImageJ dependencies (e.g., `imglib2`, `scifio`) to
the `libraryDependencies` in the `build.sbt` file in the scaffolded project.
Getting the right versions for these libraries can be tricky since you cannot
depend on the [`pom-scijava` artefact](https://github.com/scijava/pom-scijava)
available for Maven builds.

You can also add external Java and Scala dependencies that aren't typically available
through ImageJ. The scaffolded project includes the `sbt-assembly` plugin for
creating UberJARs, such that external dependencies can be bundled in your JAR.
To create an UberJAR:

```
sbt assembly
```

Note that if you intend to use the `assembly` task to create an UberJAR for your
plugin, you must make sure that all dependencies provided by ImageJ are tagged with
the "provided" profile, to indicate that these dependencies will be available at
runtime and thus don't need to be bundled. If you don't do this, you will end
up with Class conflicts when you install in Fiji/ImageJ.

Please refer to the [sbt-assembly documentation](https://github.com/sbt/sbt-assembly)
for more information.

SBT configurations can be daunting when starting out. It is worth the effort though. You can get information about it from the [SBT website](http://www.scala-sbt.org/documentation.html).

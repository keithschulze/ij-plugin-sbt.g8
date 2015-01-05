# Giter8 template for ImageJ plugins in Scala

# Installation instructions
Please see the [Giter8](https://github.com/n8han/giter8) page for detailed instruction on how to install. If you are on Mac the easiest is probably to use [Homebrew](http://brew.sh/):

`brew install giter8`


# Basic Usage
Once Giter8 and it's dependencies are installed, setting up a new plugin is as easy as:

```
g8 https://github.com/keithschulze/ij-plugin-sbt.g8
```

You'll be prompted for some information about the plugin you want to develop and then a new SBT project will be setup.

If you a new to SBT (Simple Build Tool), you can get information about it from the [SBT website](http://www.scala-sbt.org/documentation.html). This template makes use of the excellent [sbt-imagej](https://github.com/jpsacha/sbt-imagej) plugin for SBT. This plugin provides tools for testing your new plugin in ImageJ without much hassle. In fact, the newly created project is a fully funtional ImageJ plugin. Test it yourself:

```
cd <project_name>
sbt ijRun
```

You'll find an entry in the Plugins menu, which will run your plugin. At the moment it will simply open up a dialog box with a silly message, but you're about to go an change that so... happy coding.
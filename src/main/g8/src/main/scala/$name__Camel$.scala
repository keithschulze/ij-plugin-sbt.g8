package $organization$

import org.scijava.ItemIO
import org.scijava.command.Command
import org.scijava.plugin.{Plugin, Parameter}

@Plugin(`type` = classOf[Command], headless = true, menuPath = "Plugins>$name;format="Camel"$")
class $name;format="Camel"$ extends Command {

 @Parameter(label = "What is your name?")
  var name: String = "J. Doe"

  @Parameter(`type` = ItemIO.OUTPUT)
  var greeting: String = _

  /**
  * Entry point to running a plugin.
  */
  override def run(): Unit =  {
    greeting = "Hello " + name + "!"
  }
}

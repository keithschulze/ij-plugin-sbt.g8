package $organization$

import ij.IJ
import ij.plugin.PlugIn

class $name;format="Camel"$_ extends PlugIn {

  /**
  * Entry point to running a plugin.
  */
  override def run(arg: String): Unit =  {
    IJ.showMessage("Yay, I'm alive!")
  }
}
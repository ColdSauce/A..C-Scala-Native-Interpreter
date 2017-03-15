/**
  * Created by stefan on 3/14/17.
  */
object Launcher {
  def printUsage(): Unit = {
     println("Usage: ./APLIAFCLDTCITAMPAC <file name>")
  }

  def main(args: Array[String]): Unit = {
    if(args.length == 1) {
      val fileName = args(0)
      // The following code doesn't work with Scala native just yet.. The code to get it to work is ugly so I'm not
      // going to even bother...
//      fileName.split(".").lift(1) match {
//        case Some(extension) => if(extension.toUpperCase == "APLIAFCLDTCITAMPAC") Interpreter.run(fileName) else println("Invalid file extension!")
//        case None => println("Invalid file extension!")
//      }
      Interpreter.run(fileName)
    } else {
      val firstTimeRunning = true
      Interpreter.runLiveInterpreter(firstTimeRunning)
    }
  }
}

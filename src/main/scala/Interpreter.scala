/**
  * Created by stefan on 3/14/17.
  */
object Interpreter {
  def run(fileName: String): Unit = {
    println("A programming language is a formal computer language designed to communicate instructions to a machine, particularly a computer.")
  }

  def runLiveInterpreter(firstTime: Boolean): Unit = {
    // Scala Native's compiler has a bug so when you try to read from StdIn, it will seg fault.
    // This code works in regular Scala, though...
//    if(firstTime) {
//      println("Welcome to the A programming language is a formal computer language designed to communicate instructions to a machine, particularly a computer. interpreter.")
//      println("")
//      runLiveInterpreter(false)
//    } else {
//      print(">> ")
//      val newLine = scala.io.StdIn.readLine()
//      println("A programming language is a formal computer language designed to communicate instructions to a machine, particularly a computer.")
//      println("This programming language was created by https://esolangs.org/wiki/User:Rottytooth")
//      println("Unfortunately, it is not turing complete yet. I have forked the project and am working hard on it. Stay tuned.")
//      runLiveInterpreter(false)
//    }
    run("")
  }
}

package example

import example.MyIncarnation.factory

import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js.annotation.JSExportTopLevel

object HelloScalaJs {
  def setupUI(): Unit ={
    println("Hello ScalaJS!")
    ScalaJsUtils.appendPar(document.body,  "Hello ScalaJs into DOM!")

    val button = document.createElement("button")
    button.textContent = "Click me!"
    button.addEventListener("click", { (e: dom.MouseEvent) => ScalaJsUtils.addClickedMessage() })
    document.body.appendChild(button)
  }

  def main(args: Array[String]): Unit = {
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
      setupUI()
    })

    // The following does not work
    // For more, see: https://www.scala-js.org/doc/project/linking-errors.html#depending-on-a-jvm-library-instead-of-a-js-library
    /*
    val program = new BasicUsageProgram()

    // Simulate first round for device 0, with empty context
    val c1 = factory.context(selfId = 0, exports = Map(), lsens = Map(), nbsens = Map())
    val e1 = program.round(c1)

    // Simulate second round for device 0, with context given only by its previous export
    val c2 = factory.context(0, Map(0 -> e1))
    val e2 = program.round(c2)

    // Print contexts and exports in output
    println(s"c1=$c1\ne1=$e1\n\nc2=$c2\ne2=$e2")
     */
    /* LINKING ERRORS
[error] Referring to non-existent class it.unibo.scafi.core.Engine$EngineFactory
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent method it.unibo.scafi.core.Engine$EngineFactory.context$default$4()scala.collection.immutable.Map
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
     */
  }
}
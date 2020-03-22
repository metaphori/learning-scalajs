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
    /*
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
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent method it.unibo.scafi.core.Engine$EngineFactory.context(java.lang.Object,scala.collection.immutable.Map,scala.collection.immutable.Map,scala.collection.immutable.Map)it.unibo.scafi.core.Core$Context
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent method it.unibo.scafi.core.Engine$EngineFactory.context$default$3()scala.collection.immutable.Map
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Core$Export
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Core$Context
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Engine$EngineFactory
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.incarnations.Incarnation$AggregateProgram
[error]   called from example.BasicUsageProgram
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.incarnations.BasicAbstractIncarnation
[error]   called from example.MyIncarnation$
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Core$Context
[error]   called from example.BasicUsageProgram.round(it.unibo.scafi.core.Core$Context,scala.Function0)it.unibo.scafi.core.Core$Export
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.BasicUsageProgram
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Core$Export
[error]   called from example.BasicUsageProgram.round(it.unibo.scafi.core.Core$Context,scala.Function0)it.unibo.scafi.core.Core$Export
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.BasicUsageProgram
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Semantics$ExecutionTemplate
[error]   called from example.BasicUsageProgram.round(it.unibo.scafi.core.Core$Context,scala.Function0)it.unibo.scafi.core.Core$Export
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.BasicUsageProgram
[error]   example.HelloScalaJs$
[error] Referring to non-existent method it.unibo.scafi.core.Semantics$ExecutionTemplate.round(it.unibo.scafi.core.Core$Context,scala.Function0)it.unibo.scafi.core.Core$Export
[error]   called from example.BasicUsageProgram.round(it.unibo.scafi.core.Core$Context,scala.Function0)it.unibo.scafi.core.Core$Export
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.BasicUsageProgram
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Semantics$ExecutionTemplate
[error]   called from example.BasicUsageProgram.round$default$2()java.lang.Object
[error]   called from private example.HelloScalaJs$.$anonfun$main$1(example.BasicUsageProgram)java.lang.Object
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.BasicUsageProgram
[error]   example.HelloScalaJs$
[error] Referring to non-existent method it.unibo.scafi.core.Semantics$ExecutionTemplate.round$default$2()java.lang.Object
[error]   called from example.BasicUsageProgram.round$default$2()java.lang.Object
[error]   called from private example.HelloScalaJs$.$anonfun$main$1(example.BasicUsageProgram)java.lang.Object
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.BasicUsageProgram
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Engine$EngineFactory
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.Engine$EngineFactory
[error]   called from example.MyIncarnation$.factory()it.unibo.scafi.core.Engine$EngineFactory
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.MyIncarnation$
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.incarnations.BasicAbstractIncarnation
[error]   called from constructor example.MyIncarnation$.<init>()void
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent method it.unibo.scafi.incarnations.BasicAbstractIncarnation.$init$()void
[error]   called from constructor example.MyIncarnation$.<init>()void
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Referring to non-existent class it.unibo.scafi.core.RichLanguage$Builtins
[error]   called from constructor example.BasicUsageProgram.<init>()void
[error]   called from example.HelloScalaJs$.main([java.lang.String)void
[error]   called from static example.HelloScalaJs.main([java.lang.String)void
[error]   called from core module module initializers
[error] involving instantiated classes:
[error]   example.HelloScalaJs$
[error] Not showing 44 more linking errors

     */
  }
}
package example

import it.unibo.scafi.incarnations.BasicAbstractIncarnation

// 1. Define (or import) an incarnation, which provides an instantiation of types and other classes to import
object MyIncarnation extends BasicAbstractIncarnation

// 2. Bring into scope the stuff from the chosen incarnation
import MyIncarnation._

// 3. Define an "aggregate program" using the ScaFi DSL by extending AggregateProgram and specifying a "main" expression
class BasicUsageProgram extends AggregateProgram  {
  override def main(): Any = rep(0)(_+1)
}
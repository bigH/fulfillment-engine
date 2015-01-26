package com.angieslist.fulfillment.dsl

import com.angieslist.fulfillment.api
import com.angieslist.fulfillment.model._
import api.events._
import api.interactions._

trait Builder {
  import BuilderUtils._

  implicit class BuilderFromEngine (engineImpl: EngineImpl) {
    def given(states: State*) =
      new BuilderWithStates(engineImpl, states)
  }

  class BuilderWithStates (
    engineImpl: EngineImpl,
    states: Seq[State]
  ) {
    def react[E <: Event](reactors: Reactor[E]*) =
      new BuilderWithStatesAndReactors(engineImpl,
                                       states,
                                       Reactors(reactors))
  }

  class BuilderWithStatesAndReactors[E <: Event] (
    engineImpl: EngineImpl,
    states: Seq[State],
    reactors: Reactors[E]
  ) {
    // XXX finish or move to above code
    def construct = ???
  }

}

object Builder extends Builder


object Stuff {
  import DSL._

  val engine: EngineImpl = _

  engine given (
    Opened, Matched, Closed
  ) react (
    Unhandled, Unhandled
  )
}
package com.angieslist.fulfillment.dsl

import com.angieslist.fulfillment.api
import api.events._

private object BuilderUtils {
  // TODO needs testing
  case class Reactors[E <: Event](reactors: Seq[Reactor[E]]) extends Reactor[E] {
    override def react: Respond = {
      val composedHandler = reactors reduce (_.react orElse _.react)
      composedHandler orElse Unhandled.react
    }
  }

}


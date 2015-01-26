package com.angieslist.fulfillment.api.events

import com.angieslist.fulfillment.api.errors.UnhandledEvent

// NOTES

// in order to better build handlers, we're choosing to use the
//
//

trait Reactor[E <: Event] {
  type Respond = PartialFunction[E, Unit]

  def react: Respond
}

object Unhandled extends Reactor[_] {
  def react = {
    case e => throw UnhandledEvent(e)
  }
}

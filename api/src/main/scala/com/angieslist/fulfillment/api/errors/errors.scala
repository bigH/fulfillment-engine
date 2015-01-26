package com.angieslist.fulfillment.api.errors

import com.angieslist.fulfillment.api.events.Event

// `null` used here to wrap Java "null-y-ness" so we can use `Option[Throwable]` hence forth
class EngineException(message: String, cause: Option[Throwable] = None) extends Exception(message, cause.orNull)

case class UnhandledEvent[T <: Event](e: T, cause: Option[Throwable] = None)
  extends EngineException(s"Received event $e and no handlers were triggered.", cause)

package com.angieslist.fulfillment.model

sealed trait Transition[S <: State]
case class FunctionalTransition[S](f: S => S) extends Transition[S]
case class SimpleTransition[S](before: S, after: S) extends Transition[S]
case object NoTransition extends Transition[Nothing]

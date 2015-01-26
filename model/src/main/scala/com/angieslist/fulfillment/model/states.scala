package com.angieslist.fulfillment.model

sealed trait State

case class NamedState(name: String) extends State

object Opened extends NamedState("Opened")
object Matched extends NamedState("Matched")
object Closed extends NamedState("Closed")

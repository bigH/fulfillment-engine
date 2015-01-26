package com.angieslist.fulfillment.api.events

trait Event {
  def id: String
  def producer: String
}

case class MessageSent (
  override val id: String,
  override val producer: String,

  message: String,
  subject: String,
  room: String,
  serviceRequest: String
) extends Event
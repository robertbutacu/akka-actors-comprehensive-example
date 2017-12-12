package restaurant

import akka.actor.{Actor, Props}

object Restaurant {
  def props(name: String) = Props(new Restaurant(name, 5))

  case object BookAtRestaurant

  case object BookingFull

  case object Booked
}

class Restaurant(val name: String, var availableSeats: Int) extends Actor {
  override def receive: Receive = ???
}

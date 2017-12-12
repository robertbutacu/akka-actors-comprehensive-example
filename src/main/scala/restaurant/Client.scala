package restaurant

import akka.actor.{Actor, Props}
import restaurant.menu.Order

object Client {
  def props(name: String) = Props(new Client(name))

  case object BookAtRestaurant

  case object BookingFull

  case object Booked

  case object SitAtRestaurant

  case object ReadyToOrder

  case object GetOrder

  case class GiveOrder(order: Order)

  case object OrderReady
}

class Client(val name: String) extends Actor {
  override def receive: Receive = ???
}

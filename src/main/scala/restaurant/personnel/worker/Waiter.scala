package restaurant.personnel.worker

import akka.actor.{Actor, Props}
import restaurant.menu.Order

object Waiter {
  def props(name: String) = Props(new Waiter(name))
  def name() = "waiter"

  case object ReadyToOrder//client is ready

  case object GetOrder//waiter goes

  case class GiveOrder(order: Order)//client gives order

  case object OrderReady//
}

class Waiter(val name: String) extends Actor {
  override def receive: Receive = ???
}

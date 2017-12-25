package restaurant.personnel.master

import akka.actor.{Actor, Props}
import restaurant.personnel.worker.Waiter.ReadyToOrder

object ChefMaster {
  def props(numberOfChefs: Int) = Props(new ChefMaster())

  def name() = "chefMaster"
}


class ChefMaster extends Actor {
  override def receive: Receive = {
    case ReadyToOrder => println("Client ready to order")
  }
}

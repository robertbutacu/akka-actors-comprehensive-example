package restaurant.personnel.master

import akka.actor.{Actor, Props}

object WaiterMaster {
  def props(numberOfWaiters: Int) = Props(new WaiterMaster(numberOfWaiters))
  def name() = "waiterMaster"
}

class WaiterMaster(numberOfWaiters: Int) extends Actor{
  override def receive: Receive = ???
}

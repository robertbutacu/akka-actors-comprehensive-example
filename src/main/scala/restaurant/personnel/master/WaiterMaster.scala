package restaurant.personnel.master

import akka.actor.{Actor, Props}

object WaiterMaster {
  def props() = Props(new WaiterMaster())
}

class WaiterMaster extends Actor{
  override def receive: Receive = ???
}

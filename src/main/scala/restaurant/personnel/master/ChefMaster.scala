package restaurant.personnel.master

import akka.actor.{Actor, Props}

object ChefMaster {
  def props() = Props(new ChefMaster())
}


class ChefMaster extends Actor{
  override def receive: Receive = ???
}

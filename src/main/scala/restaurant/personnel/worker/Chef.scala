package restaurant.personnel.worker

import akka.actor.{Actor, Props}

object Chef {
  def props(name: String) = Props(new Chef(name))
}

class Chef(val name: String) extends Actor {
  override def receive: Receive = ???
}

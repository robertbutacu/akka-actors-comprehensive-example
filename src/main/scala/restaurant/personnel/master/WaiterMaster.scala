package restaurant.personnel.master

import akka.actor.{Actor, Props}
import restaurant.personnel.master.WaiterMaster.HireWaiter
import restaurant.personnel.worker.Waiter

object WaiterMaster {
  def props(numberOfWaiters: Int) = Props(new WaiterMaster(numberOfWaiters))
  def name() = "waiterMaster"

  case class HireWaiter(name: String)
}

class WaiterMaster(numberOfWaiters: Int) extends Actor{
  def hireWaiter(name: String) = context.actorOf(Waiter.props(name), Waiter.name())

  override def receive: Receive = {
    case HireWaiter(name) => _

  }
}

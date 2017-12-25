package restaurant

import akka.actor._
import restaurant.Client._
import restaurant.menu.Order

object Client {
  def props(name: String) = Props(new Client(name))

  case object BookAtRestaurant

  case object BookingFull

  case object Booked

  case object ReadyToOrder

  case object GetOrder

  case class GiveOrder(order: Order)

  case object OrderReady

}

class Client(val name: String) extends Actor {
  def atRestaurant: Receive = {
    case ReadyToOrder => context.actorSelection("../WaiterMaster") ! ReadyToOrder
  }


  override def receive: Receive = {
    case BookAtRestaurant => context.actorSelection("../Restaurant") ! BookAtRestaurant

    case BookingFull      => println("The restaurant can't book anymore! I'm done"); self ! PoisonPill

    case Booked           => println("I'm in! Ready for next step"); context.become(atRestaurant)

    case _                => println("I haven't booked yet!")
  }
}

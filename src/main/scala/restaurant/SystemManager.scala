package restaurant

import akka.actor.{Actor, ActorRef, ActorSystem}
import akka.util.Timeout
import restaurant.personnel.master.{ChefMaster, WaiterMaster}

import scala.concurrent.duration._

class SystemManager() {
  implicit val timeout: Timeout = Timeout(5 seconds)
  implicit val actorSystem: ActorSystem = ActorSystem("Akka Actors")
  lazy private val restaurant: ActorRef = actorSystem.actorOf(Restaurant.props("Papa John's"), Restaurant.name())
  lazy private val waiterMaster: ActorRef = actorSystem.actorOf(WaiterMaster.props(2), WaiterMaster.name())
  lazy private val chefMaster: ActorRef = actorSystem.actorOf(ChefMaster.props(2), ChefMaster.name())

}

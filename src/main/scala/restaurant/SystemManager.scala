package restaurant

import akka.actor.ActorSystem
import akka.util.Timeout
import scala.concurrent.duration._

class SystemManager() {
  implicit val timeout: Timeout = Timeout(5 seconds)
  implicit val actorSystem: ActorSystem = ActorSystem("Akka Actors")
}

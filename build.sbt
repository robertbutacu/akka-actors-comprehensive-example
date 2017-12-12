name := "akka-actors-comprehensive-example"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= {
  val akkaVersion = "2.4.12"
  Seq("com.typesafe.akka" %% "akka-actor" % akkaVersion)
}
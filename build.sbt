name := "scalaintrocourse"

organization := "org.hablapps"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-language:higherKinds")

initialCommands in console := """
  | import org.hablapps.curso._
  | import intro._
  | import oo._
  | import funcional._
  | import azucar._
  | import genericidad._
  |""".stripMargin

name := "scalaintrocourse"

organization := "org.hablapps"

unmanagedSourceDirectories in Compile ++= Seq(
  baseDirectory.value / "tema1-objetos",
  baseDirectory.value / "tema2-sintaxis",
  baseDirectory.value / "tema3-genericidad",
  baseDirectory.value / "tema4-funcional"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  // "-Xprint:typer",
  // "-Xlog-implicit-conversions",
  "-language:higherKinds")

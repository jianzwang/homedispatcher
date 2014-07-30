name := """homedispatcher"""

version := "2.3-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc"       % "2.0.7",
  "org.scalikejdbc" %% "scalikejdbc-config"  % "2.0.7",
  "com.h2database"  %  "h2"                % "1.4.180",
  "ch.qos.logback"  %  "logback-classic"   % "1.1.2"
)

// JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

//MochaKeys.requires += "./Setup"

// Apply RequireJS optimization, digest calculation and gzip compression to assets
//pipelineStages := Seq(rjs, digest, gzip)
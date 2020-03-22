enablePlugins(ScalaJSPlugin)
// fastOptJS task to re-compile
// ~fastOptJS for hot reload
// run for running

scalaJSUseMainModuleInitializer := true

// Allows running a ScalaJS app that manipulates DOM outside the browser
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

resolvers += Resolver.DefaultMavenRepository

/**
 * https://github.com/vmunier/play-scalajs.g8/issues/20
 * Starting from Scala.js 0.5.4, %%% became a macro that desugars into something calling the .value macro on a setting.
 * This is so that it can detect whether it's being used in a Scala/JS or Scala/JVM project.
 * But this means %%% can only be used in the same places where .value can be used,
 * i.e., inside a "Def", e.g., as the right-hand-side of :=, += or ++= on a setting key.
 */
// val scalajs_dom = "org.scala-js" %%% "scalajs-dom" % "1.0.0"

val scafi_core  = "it.unibo.apice.scafiteam" %% "scafi-core"  % "0.3.2"

testFrameworks += new TestFramework("utest.runner.Framework")

lazy val myProject = (project in file("."))
  .settings(
    name := "learning-scalajs",
    version := "0.1",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.0.0",
      "com.lihaoyi" %%% "utest" % "0.7.4" % "test",
      scafi_core)
  )
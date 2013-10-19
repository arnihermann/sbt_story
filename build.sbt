import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

name := "test"

libraryDependencies += "com.sparkjava" % "spark-core" % "1.0"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"

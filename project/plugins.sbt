addSbtPlugin("org.scalameta"      % "sbt-scalafmt"              % "2.5.0")
addSbtPlugin("ch.epfl.scala"      % "sbt-scalafix"              % "0.10.4")
addSbtPlugin("com.github.cb372"   % "sbt-explicit-dependencies" % "0.2.16")
addSbtPlugin("com.eed3si9n"       % "sbt-buildinfo"             % "0.11.0")
addSbtPlugin("com.github.sbt"     % "sbt-ci-release"            % "1.5.11")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"                   % "0.4.3")
addSbtPlugin("dev.zio"            % "zio-sbt-website"           % "0.3.10")

libraryDependencies += "org.snakeyaml" % "snakeyaml-engine" % "2.5"

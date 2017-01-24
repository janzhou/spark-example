lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.janzhou",
      scalaVersion := "2.11.8",
      version      := "0.1.x"
    )),
    name := "spark-example",
    crossScalaVersions := Seq("2.11.8", "2.12.1"),
    scalacOptions in Compile in doc ++= Seq(
      "-doc-title", "Spark Example",
      "-sourcepath", (baseDirectory in ThisBuild).value.toString,
      "-doc-source-url", s"https://github.com/janzhou/${name.value}/tree/${(version in ThisBuild).value.toString}€{FILE_PATH}.scala"
    ),
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "2.1.0",
      "org.scalatest" %% "scalatest" % "3.0.1" % Test
    )
  )

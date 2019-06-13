import mill._, scalalib._

object app extends ScalaModule{
  def scalaVersion = "2.12.4"
  def catsVersion = "1.3.1"


  override def ivyDeps = Agg(
    ivy"org.typelevel::cats-core:$catsVersion",
    ivy"org.typelevel::cats-effect:$catsVersion",
  )


  object test extends Tests {
    override def ivyDeps = Agg(
      ivy"com.lihaoyi::utest:0.6.3",
      ivy"org.mockito::mockito-scala:0.0.7",
    )
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
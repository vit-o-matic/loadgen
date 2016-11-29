
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/harish.maiya/project/vit-o-matic/loadgen/conf/routes
// @DATE:Tue Nov 29 11:48:06 PST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

// TODO: rename this ReverseControllersImpl
class ControllersImpl extends ControllersTrait {
  /** Reverse-routes imaginary endpoint called getPage. */
  override def getPage: String = "/poop"

  /** 
   * Uncomment this to change the public interface of
   * ControllersImpl. If routes.java is directly using ControllersImpl
   * this will cause a full recompilation of the app (represented by
   * compilation of Endpoint.scala).
   *
   * That full recompilation won't happen if routes.java instead
   * has return types of the ControllersTrait
   */
  // override def anotherMethod: String = "herp"
}
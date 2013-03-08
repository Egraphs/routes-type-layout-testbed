/**
 * This class represents any type in the application that needs to use the reverse router
 * for us, this is most frequently in an endpoint.
 */
class Endpoint {
  def useTheReverseRouter = {
    println("the page is " + routes.Controllers.getPage)
  }
}
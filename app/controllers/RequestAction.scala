package controllers



import play.api.mvc._
import play.api.libs.json._
import play.api.mvc.Result



/**
 * User: jianzwang
 * Date: 7/30/14
 * Time: 15:08
 */
class BaseRequest(val content:JsValue, request: Request[AnyContent]) extends WrappedRequest(request)

class BaseController extends Controller{
  def Authenticated(f:BaseRequest => Result) = {
    Action { request => {
        request.body.asText.fold(Redirect(""))(
          (text:String) => {
            val body = (Json.parse(text) \ "result")
            f(new BaseRequest(body,request))
          }
      )
      }
    }
  }
}
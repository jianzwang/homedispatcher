package controllers.login

import models.login.LoginRequest
import play.api.mvc.{BodyParsers, Controller}
import play.api.libs.json._
import controllers.{BaseRequest, BaseController}

/**
 * User: jianzwang
 * Date: 7/30/14
 * Time: 14:22
 */
object LoginController extends BaseController{
  def login = Authenticated
  {
    implicit request:BaseRequest =>
      implicit val requestReads = Json.reads[LoginRequest]
      request.content.validate[LoginRequest].fold(
        errors => {
          BadRequest(Json.obj("status" ->"KO", "message" -> JsError.toFlatJson(errors)))
        },
        loginRequest => {
          Ok("works")
        }
      )
  }

}

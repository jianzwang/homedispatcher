package models.login

import models.BaseRequestContent
import play.api.libs.functional.syntax._
import play.api.libs.json.Json


/**
 * User: jianzwang
 * Date: 7/30/14
 * Time: 14:19
 */
case class LoginRequest(val userName:String,val userPwd:String,appVersion:String) extends BaseRequestContent[LoginRequest]
{

}





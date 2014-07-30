package models

import play.api.libs.json.Json

/**
 * User: jianzwang
 * Date: 7/30/14
 * Time: 14:12
 */

trait BaseRequestContent[A]
{

}

case class BaseRequestElement(id:String,memo:String,resultStatus:String)
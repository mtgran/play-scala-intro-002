package models

import play.api.libs.json.Json


/**
  * Created by mtgran on 25.11.16.
  */
case class UserBP (name: String)

object UserBP {

  implicit val userBPFormat = Json.format[UserBP]


}
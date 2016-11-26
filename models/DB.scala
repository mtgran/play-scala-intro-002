package models

import sorm._

/**
  * Created by mtgran on 26.11.16.
  */
object DB extends Instance (entities = Seq(Entity[UserBP]), url = "jdbc:h2:mem:test") {




}

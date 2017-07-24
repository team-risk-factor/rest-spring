package hello

import scala.beans.BeanProperty

case class Greeting(@BeanProperty val id: Long, @BeanProperty val content:String) {
    
}
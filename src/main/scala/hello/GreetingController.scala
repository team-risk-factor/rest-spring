package hello

import scala.beans.BeanProperty
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam, RestController}

@RestController
class GreetingController {
    val template = "Hello, %s!"
    val counter = new AtomicLong()

    @RequestMapping(Array("/greeting"))
    def greeting(@RequestParam(value="name", defaultValue="World") name: String) = {
        new Greeting(counter.incrementAndGet(), s"Hello, $name !")
    } 
}

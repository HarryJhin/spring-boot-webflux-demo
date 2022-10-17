package blog.jinhyun.demo.controller

import blog.jinhyun.demo.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val helloService: HelloService) {
    @GetMapping
    fun hello() = helloService.getHello()
}

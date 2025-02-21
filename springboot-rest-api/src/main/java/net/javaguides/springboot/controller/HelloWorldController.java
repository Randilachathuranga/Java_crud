package net.javaguides.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController is a specialized version
// of @Controller that automatically
// serializes responses into JSON or XML without requiring
// @ResponseBody on each method.
public class HelloWorldController {

    //HTTP GET Request
    //http://localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello Randila";
    }
}

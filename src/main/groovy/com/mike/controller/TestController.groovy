package com.mike.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

//@RestController
@Controller
class TestController {
    
    // groovy @Value 只能用單上引號'
    @Value('${com.mike.name}')
    private String message;
    
    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", this.message);
        return "index";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }
    
    @RequestMapping("/welcome")
    public String index() {
        
//        Hello hello = new Hello();
//        hello.test();
        println "Greetings from Spring Boot!"
        
        return "welcome"
    }
    
}

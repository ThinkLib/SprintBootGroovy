package com.mike

import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class Test {
    
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }
    
    @RequestMapping("/test")
    public String index() {
        
//        Hello hello = new Hello();
//        hello.test();
        return "Greetings from Spring Boot!";
    }
    
}

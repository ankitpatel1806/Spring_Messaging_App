package com.springboot.messaging_app.controller;

import com.springboot.messaging_app.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello(){return "Hello from BridgeLabz";}
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String print(@PathVariable("name") String name ){
        return "Hello "+name;
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
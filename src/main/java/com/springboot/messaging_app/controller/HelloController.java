package com.springboot.messaging_app.controller;

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
}
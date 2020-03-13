package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("Inside hello()");
        return "Hello from Spring!";
    }

    @GetMapping(path = "/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        System.out.println("Inside sayHello()");
        return "Hello " + name + "!";
    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }
}

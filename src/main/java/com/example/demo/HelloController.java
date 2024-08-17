package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "dark", defaultValue = "false") boolean darkMode) {
        return darkMode ? "<h1 style='color:black;background:black'>Dark World!</h1>" : "Landed here-- Develop your contenet to be displayed in web page";
    }
}

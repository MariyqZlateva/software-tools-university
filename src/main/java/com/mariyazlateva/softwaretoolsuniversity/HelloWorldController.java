package com.mariyazlateva.softwaretoolsuniversity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping
    public String getHelloWorldMessage() {
        return "Hello World Updated!";
    }

}
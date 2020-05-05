package com.azure.appservice.springtestdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Joiner;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        // Use the Guava library as an example of an external dependency.
        Joiner joiner = Joiner.on(" ").skipNulls(); 
        return joiner.join("Hello", null, "from", "Spring", "Boot");
    }
}
package com.example.TestApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesController {

    @GetMapping("/math/pi")
    public String math() {

        return "3.141592653589793";
    }
}
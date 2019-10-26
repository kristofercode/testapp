package org.kristofercode.testapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Value("${user:notspecified}")
    String user;

    @GetMapping("test")
    public String test() {

        return "user is " + user;
    }
}

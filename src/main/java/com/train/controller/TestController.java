package com.train.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author GaoWei
 * @Data Created on 2023-12-05
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
      return "Hello World!21";
    }
}

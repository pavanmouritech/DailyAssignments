package com.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
     private static final Logger LOG = Logger.getLogger(MyController.class.getName());

    @RequestMapping("/")
       public String index() {
          LOG.log(Level.INFO, "Index API is calling");
          return "Welcome Pavan!";
       }
}
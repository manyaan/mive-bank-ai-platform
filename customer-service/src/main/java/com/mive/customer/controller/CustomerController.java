package com.mive.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mive/customer")
public class CustomerController {

  public void get() {
    System.out.println("Hello World");
  }

  public void create() {}
}

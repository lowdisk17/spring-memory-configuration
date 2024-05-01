package com.configuration.configuration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.configuration.configuration.dto.Info;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

  @GetMapping("service")
  public Info getMethodName() {
    Info info = new Info();
    info.setHeapSize(Runtime.getRuntime().totalMemory());
    info.setMaxHeapSize(Runtime.getRuntime().maxMemory());
    info.setFreeHeapSize(Runtime.getRuntime().freeMemory());
    return info;
  }
  
}

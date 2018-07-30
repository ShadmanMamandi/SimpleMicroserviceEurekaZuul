package com.shiva.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodbyeController {

  /*  @RequestMapping(value = "/goodbye", method = RequestMethod.GET)
    public String greeting() {
        return "Goodbye";
    }*/
  @Autowired
  private DiscoveryClient discoveryClient;

    @RequestMapping("/greeting")
 public String greeting(){
        return  "Hello";
    }


}

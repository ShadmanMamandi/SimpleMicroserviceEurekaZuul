package com.client.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Client {

    @RequestMapping("/goodbye")

   /* public String greeting(){
        return  "goodbye";
    }*/
    public String goodbye() {
        RestTemplate restTemplate = new RestTemplate();
        String quote = restTemplate.getForObject("http://localhost:8085/greeting", String.class);
        return quote;
    }

}





package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest3;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.util.List;


@Component
public class OrdersClient {
    private @Inject
    RestTemplate restTemplate;

    public List<Order> fetchOrders() {
        return this.restTemplate.getForObject("http://orders/orders/", List.class);
        //return this.restTemplate.getForObject("https://google.com", List.class);
        //return this.restTemplate.getForObject("http://172.31.142.243:22", List.class);
    }
}
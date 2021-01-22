package com.codecool.deliverysys;

import java.util.List;

public class Courier {
    public Courier(List<Order> orders) {
        for( Order order : orders){
            System.out.println(order.toString());
        }
    }
}

package com.codecool.deliverysys;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Order> orders = new ArrayList<>();
    public static void main(String[] args) {
        orders.add(new Order(2,"db","Hawaii pizza","06209595942 Ödi"));
        orders.add(new Order(2,"liter","CocaCola","06209595942 Ödi"));

        Courier pista = new Courier(orders);
    }
}

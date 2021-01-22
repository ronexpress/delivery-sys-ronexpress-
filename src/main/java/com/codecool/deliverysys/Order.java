package com.codecool.deliverysys;


import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Order {
    private static int idcount=0;
    private int id;
    private LocalDateTime time;
    private int quantity;
    private String units;
    private String name;
    private String customer;

    public Order(int quantity, Stgit ring units, String name, String customer) {
        this.id=idcount++;
        this.time=LocalDateTime.now();
        this.quantity = quantity;
        this.units = units;
        this.name = name;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", time=" + time +
                ", quantity=" + quantity +
                ", units='" + units + '\'' +
                ", name='" + name + '\'' +
                ", customer='" + customer + '\'' +
                '}';
    }
}

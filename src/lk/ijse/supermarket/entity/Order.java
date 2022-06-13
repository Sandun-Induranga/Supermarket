package lk.ijse.supermarket.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Orders")
public class Order {
    @Id
    @MapsId("orderId")
    private String orderId;
    private String date;
    private double cost;
    @ManyToOne
    private Customer customer;
    @ManyToMany(mappedBy = "order")
    private
    List<OrderDetail> orderDetailList = new ArrayList<>();

    public Order(String orderId, String date, double cost, Customer customer) {
        this.orderId = orderId;
        this.date = date;
        this.cost = cost;
        this.customer = customer;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

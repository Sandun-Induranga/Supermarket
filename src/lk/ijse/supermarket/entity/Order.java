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
    private double unitPrice;
    private int qty;
    @ManyToOne
    private Customer customer;
    @ManyToMany(mappedBy = "order")
    private
    List<OrderDetail> orderDetailList = new ArrayList<>();

    public Order() {
    }

    public Order(String orderId, String date, double unitPrice, int qty, Customer customer) {
        this.orderId = orderId;
        this.date = date;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.customer = customer;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", date='" + date + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                ", customer=" + customer +
                '}';
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}

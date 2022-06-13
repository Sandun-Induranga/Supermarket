package lk.ijse.supermarket.entity;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class OrderDetail implements Serializable {
    @Id
    private
    String orderId;
    @Id
    private
    String code;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Item item;
    private int qty;
    private double unitPrice;

    public OrderDetail(String orderId, String code, Order order, Item item, int qty, double unitPrice) {
        this.orderId = orderId;
        this.code = code;
        this.order = order;
        this.item = item;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}

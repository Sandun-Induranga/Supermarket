package lk.ijse.supermarket.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity()
public class OrderDetail {
    @Id
    private
    String id;
    private
    String code;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Item item;
    private int qty;
    private double unitPrice;

    public String getOrderId() {
        return id;
    }

    public void setOrderId(String id) {
        this.id = id;
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

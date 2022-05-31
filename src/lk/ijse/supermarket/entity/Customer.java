package lk.ijse.supermarket.entity;

import embaded.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
@Entity()
public class Customer {
    @Id
    private String id;
    @Column(name = "customer_name")
    private Name name;
    private double salary;
    private String address;

    public Customer(String id, Name name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}

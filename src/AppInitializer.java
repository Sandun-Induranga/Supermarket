import lk.ijse.supermarket.entity.Customer;
import lk.ijse.supermarket.entity.Item;
import lk.ijse.supermarket.entity.Order;
import lk.ijse.supermarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;


public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

//        // Customer
//
        Customer customer1 = new Customer("C001", "Kamal", "Galle", 55000);
        Customer customer2 = new Customer("C002", "Nimal", "Colombo", 35000);
        Customer customer3 = new Customer("C003", "Bandara", "Panadura", 45000);
//        session.save(customer1);
//        session.save(customer2);
//        session.save(customer3);
//
//        session.get(Customer.class,"C001");
//
//        customer1.setName("John");
//        customer1.setAddress("London");
//        session.update(customer1);
//
//        session.delete(customer2);
//
//        // Item
//
//        Item item1 = new Item("I001", "Rice", 20, 200);
//        Item item2 = new Item("I002", "Biscuit", 100, 140);
//        Item item3 = new Item("I003", "Sugar", 50, 500);
//        session.save(item1);
//        session.save(item2);
//        session.save(item3);
//
//        session.get(Item.class,"I001");
//
//        item1.setQty(40);
//        item1.setUnitPrice(250);
//        session.update(item1);
//
//        session.delete(item2);
//
//        transaction.commit();
//        session.close();

        // Order

        Order order1 = new Order("O001", LocalDate.now().toString(),200,2,customer1);
        Order order2 = new Order("O002", LocalDate.now().toString(),700,5,customer3);
        Order order3 = new Order("O003", LocalDate.now().toString(),450,1,customer1);

        session.save(order1);
        session.save(order2);
        session.save(order3);

        session.get(Item.class,"I001");

        order1.setQty(1);
        order1.setUnitPrice(250);
        session.update(order1);

        session.delete(order3);

        transaction.commit();
        session.close();
    }
}

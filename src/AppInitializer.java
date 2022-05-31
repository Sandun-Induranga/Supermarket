import embaded.Name;
import lk.ijse.supermarket.entity.Customer;
import lk.ijse.supermarket.entity.Item;
import lk.ijse.supermarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Name name = new Name("John","Silva","Perera");

        Customer customer1 = new Customer("C001", name, 30000, "Galle");
//        Customer customer2 = new Customer("C002", "Kamal", 40000, "Panadura");
//        Customer customer3 = new Customer("C003", "Nimal", 50000, "Matara");

        // Save Customer
        session.save(customer1);
//        session.save(customer2);
//        session.save(customer3);
//
//        // Update
//        customer1.setSalary(35000);
//        session.update(customer1);
//
//        // get customer
//        Customer c2 = session.get(Customer.class,"C001");
//        System.out.println(c2);
//
//        // delete customer
//        Customer c3 = session.get(Customer.class,"C002");
//        session.delete(c3);
//
//
//        Item item1 = new Item("ITM001","Rice",20,550.00);
//        Item item2 = new Item("ITM002","Dahl",500,100.00);
//        Item item3 = new Item("ITM003","Soap",40,140.00);
//
//        // Save Item
//        session.save(item1);
//        session.save(item2);
//        session.save(item3);
//
//        // Update Item
//        item1.setQty(50);
//        session.update(item1);
//
//        // get Item
//        Item i2 = session.get(Item.class,"ITM002");
//        System.out.println(i2);
//
//        // delete Item
//        Item i3 = session.get(Item.class,"ITM003");
//        session.delete(i3);

        transaction.commit();
        session.close();
    }
}

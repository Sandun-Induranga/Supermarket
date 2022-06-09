import lk.ijse.supermarket.entity.Customer;
import lk.ijse.supermarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        // Customer

        Customer customer1 = new Customer("C001", "Kamal", "Galle", 55000);
        Customer customer2 = new Customer("C002", "Nimal", "Colombo", 35000);
        Customer customer3 = new Customer("C003", "Bandara", "Panadura", 45000);
        session.save(customer1);
        session.save(customer2);
        session.save(customer3);

        session.get(Customer.class,"C001");

        customer1.setName("John");
        customer1.setAddress("London");
        session.update(customer1);

        session.delete(customer2);

        transaction.commit();
        session.close();
    }
}

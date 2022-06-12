package restapi.customer;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepository {
    static private Map<Long, Customer> customers = new HashMap<>();

    @PostConstruct
    private void init() {
        customers.put(111L, new Customer(111L, "bepi"));
        customers.put(222L, new Customer(222L, "tipi"));
        customers.put(333L, new Customer(333L, "customer3"));
    }

    public Customer getCustomerByKey(long key) {
        return customers.get(key);
    }
    public Customer setCustomerNameByKey(long key, String name) {
        Customer customer = customers.get(key);
        customer.changeName(name);
        return customer;
    }
}
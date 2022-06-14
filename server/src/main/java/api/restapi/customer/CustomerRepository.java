package api.restapi.customer;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

	static private Map<Long, Customer> customers = new HashMap<>();

	@PostConstruct
	private void init() {
		customers.put(111L, new Customer(111L, "bepi", "seoul"));
		customers.put(222L, new Customer(222L, "tipi", "seoul"));
		customers.put(333L, new Customer(333L, "customer3", "busan"));
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
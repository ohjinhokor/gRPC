package api.restapi.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

	private final CustomerRepository customerRepository;

	public Customer getCustomerByKey(long key) {
		return customerRepository.getCustomerByKey(key);
	}
}

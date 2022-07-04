package api.restapi.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

	private final CustomerRepository customerRepository;

	public ResponseDto getCustomerByKey(long key) {
		Customer customer = customerRepository.getCustomerByKey(key);
		return ResponseDto.builder().customer(customer).build();
	}
}

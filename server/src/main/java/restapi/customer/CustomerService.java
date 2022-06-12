package restapi.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public ResponseDto getCustomerByKey(long key) {
        Customer customer = customerRepository.getCustomerByKey(key);
        return ResponseDto.builder().key(key).customer(customer).build();
    }

    public ResponseDto setCustomerNameByKey(long key, String name) {
        Customer customer = customerRepository.setCustomerNameByKey(key, name);
        return ResponseDto.builder().key(key).customer(customer).build();
    }
}

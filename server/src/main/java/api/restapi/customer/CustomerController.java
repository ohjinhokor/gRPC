package api.restapi.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

	private final CustomerService customerService;

	@GetMapping()
	public ResponseDto getName(@RequestHeader(name = "key") long key) {
		return customerService.getCustomerByKey(key);
	}

	@PutMapping("/name")
	public ResponseDto setName(@RequestHeader(name = "key") long key, @RequestBody RequestDto dto) {
		return customerService.setCustomerNameByKey(key, dto.getName());
	}
}
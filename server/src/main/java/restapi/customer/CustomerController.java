package restapi.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping()
    public ResponseDto getName(@RequestHeader(name = "key") long key) {
        return customerService.getCustomerByKey(key);
    }

    @PutMapping("")
    public ResponseDto setName(@RequestHeader(name = "key") long key, @RequestBody RequestDto dto) {
        return customerService.setCustomerNameByKey(key, dto.getName());
    }
}
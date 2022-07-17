package client_library;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("grpc")
public class Controller {

	private final GrpcClient grpcClient;

	@GetMapping()
	public ResponseDto grpcGetMethod() {
		return grpcClient.getCustomerByKey(111);
	}
}

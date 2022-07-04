package client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class GrpcClientController {

	@GetMapping("")
	public static String getMethod() {
		return GrpcClientLibrary.grpcGetMethod();
	}
}
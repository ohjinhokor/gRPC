package client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class GrpcClientController {

	private final GrpcClientLibrary grpcClientLibrary;

	@GetMapping("")
	public String getMethod() {
		return grpcClientLibrary.grpcGetMethod();
	}
}

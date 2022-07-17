package client_library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GrpcClientLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcClientLibraryApplication.class, args);
	}

}

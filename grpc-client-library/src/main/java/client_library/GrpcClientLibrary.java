package client_library;

import com.fasterxml.jackson.databind.ObjectMapper;
import grpc.bepi.lib.GRequest;
import grpc.bepi.lib.GResponse;
import grpc.bepi.lib.RestApiGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import java.io.IOException;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientLibrary {

	private static ObjectMapper objectMapper = new ObjectMapper();
	private static Channel channel = ManagedChannelBuilder.forTarget("static://158.247.239.191:" + 9090).usePlaintext().build();
	private static RestApiGrpc.RestApiBlockingStub stub = RestApiGrpc.newBlockingStub(channel);

	public static ResponseDto getCustomerByKey(int key) {

		GResponse gResponse = stub.get(GRequest.newBuilder().putHeaders("key", Long.toString(key)).build());
		String responseBody = gResponse.getBody().toStringUtf8();

		try {
			return objectMapper.readValue(responseBody, ResponseDto.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
package client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;
import grpc.bepi.lib.GRequest;
import grpc.bepi.lib.GResponse;
import grpc.bepi.lib.RestApiGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import java.io.IOException;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientLibrary {

	private static Channel channel = ManagedChannelBuilder.forTarget(
		"static://localhost" + ":" + 9090).usePlaintext().build();

	private static RestApiGrpc.RestApiBlockingStub stub = RestApiGrpc.newBlockingStub(channel);

	private static ObjectMapper objectMapper = new ObjectMapper();

	public static String grpcGetMethod() {
		RequestDto requestDto = new RequestDto();
		try {
			String stringRequestDto = objectMapper.writeValueAsString(requestDto);
			ByteString bytesRequestDto = ByteString.copyFromUtf8(stringRequestDto);
			GResponse gResponse = stub.get(
				GRequest.newBuilder().setBody(bytesRequestDto).putHeaders("key", "111").build());

			String responseBody = gResponse.getBody().toStringUtf8();
			return responseBody;
		} catch (IOException e) {
			return "fail";
		}
	}
}
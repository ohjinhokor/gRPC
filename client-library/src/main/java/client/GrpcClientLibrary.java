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

	private Channel channel;

	private RestApiGrpc.RestApiBlockingStub stub;

	private ObjectMapper objectMapper = new ObjectMapper();

	public String grpcGetMethod() {
		channel =
			ManagedChannelBuilder.forTarget("static://localhost" + ":" + 9090).usePlaintext()
				.build();
		stub = RestApiGrpc.newBlockingStub(channel);

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
package api.grpc;

import api.restapi.customer.CustomerController;
import api.restapi.customer.ResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;
import grpc.bepi.lib.GRequest;
import grpc.bepi.lib.GResponse;
import grpc.bepi.lib.RestApiGrpc;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class GrpcServer extends RestApiGrpc.RestApiImplBase {

	private final CustomerController customerController;

	private final ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public void get(GRequest request, StreamObserver<GResponse> responseObserver) {
		try {
			String keyString = request.getHeadersMap().get("key");
			Long key = Long.parseLong(keyString);

			ResponseDto responseDto = customerController.getCustomerByKey(key);
			String responseDtoString = objectMapper.writeValueAsString(responseDto);

			ByteString bodyBytes = ByteString.copyFromUtf8(responseDtoString);
			GResponse response = GResponse.newBuilder().setStatus(200).setBody(bodyBytes).build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (IOException e) {
			ByteString bodyBytes = ByteString.copyFromUtf8("body is not appropriate");
			GResponse response = GResponse.newBuilder().setStatus(200).setBody(bodyBytes).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
	}
}

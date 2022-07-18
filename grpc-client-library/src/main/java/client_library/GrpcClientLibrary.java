package client_library;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import grpc.bepi.lib.GRequest;
import grpc.bepi.lib.GResponse;
import grpc.bepi.lib.RestApiGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientLibrary {

	private static ObjectMapper objectMapper = new ObjectMapper();
	private static Channel channel = ManagedChannelBuilder.forTarget("static://158.247.239.191:" + 9090).usePlaintext().build();
	private static RestApiGrpc.RestApiBlockingStub stub = RestApiGrpc.newBlockingStub(channel);

	private static ResponseDto responseDtoCache;

	public static ResponseDto getCustomerByKey(int key) {

		if (responseDtoCache != null) {
			return responseDtoCache;
		}

		GResponse gResponse = stub.get(GRequest.newBuilder().putHeaders("key", Long.toString(key)).build());
		String responseBody = gResponse.getBody().toStringUtf8();

		try {
			ResponseDto responseDto = objectMapper.readValue(responseBody, ResponseDto.class);
			setCache(responseDto);
			return responseDto;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static void setCache(ResponseDto responseDto){

		responseDtoCache = responseDto;

		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				responseDtoCache = null;
			}
		};
		timer.schedule(timerTask,10000);
	}
}


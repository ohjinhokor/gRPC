package api.restapi.customer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseDto {

	private Customer customer;
}


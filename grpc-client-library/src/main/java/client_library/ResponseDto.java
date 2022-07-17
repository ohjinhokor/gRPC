package client_library;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto implements Serializable {
	private Customer customer;
}

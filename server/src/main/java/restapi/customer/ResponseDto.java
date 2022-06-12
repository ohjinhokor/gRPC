package restapi.customer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseDto {
    private long key;
    private Customer customer;
}


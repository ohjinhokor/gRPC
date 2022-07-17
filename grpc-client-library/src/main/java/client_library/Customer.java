package client_library;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Customer {

	private long key;
	private String name;

	private String location;

	public Customer(long key, String name, String location) {
		this.key = key;
		this.name = name;
		this.location = location;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public String getName(String name) {
		return this.name;
	}

	public void changeLocation(String location) {
		this.location = location;
	}

	public String getLocation(String location) {
		return this.location;
	}
}

package Entities.Es3;

public class Users {
	private String name;
	private String surname;

	public Users(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Users{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}

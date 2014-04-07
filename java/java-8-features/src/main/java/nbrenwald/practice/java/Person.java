package nbrenwald.practice.java;

public class Person {
	private String givenName;
	private String surName;
	private int age;

	@Override
	public String toString() {
		return "Person [givenName=" + givenName + ", surName=" + surName
				+ ", age=" + age + "]";
	}

	public Person(String givenName, String surName, int age) {
		super();
		this.givenName = givenName;
		this.surName = surName;
		this.age = age;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getSurName() {
		return surName;
	}

	public int getAge() {
		return age;
	}

}
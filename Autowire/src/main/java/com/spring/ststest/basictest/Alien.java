package com.spring.ststest.basictest;

public class Alien {

	Computer com;

	public Alien() {
		System.out.println("Alien object created");
	}

	public void code() {
		System.out.println("I am coding");
		com.compile();
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
}

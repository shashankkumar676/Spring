package com.spring.ststest.basictest;

public class Alien {

	private int age;

	public void code() {
		System.out.println("I am coding");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age assigned");
		this.age = age;
	}

}

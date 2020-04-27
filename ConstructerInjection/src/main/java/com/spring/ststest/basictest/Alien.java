package com.spring.ststest.basictest;

public class Alien {

	int age;
	private Laptop laptop;

	public Alien(int age) {
		this.age = age;
	}

	public void code() {
		System.out.println("I am coding");
		laptop.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}

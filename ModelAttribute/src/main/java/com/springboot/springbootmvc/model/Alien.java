package com.springboot.springbootmvc.model;

public class Alien {

	int aid;
	String name;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + "]";
	}

}

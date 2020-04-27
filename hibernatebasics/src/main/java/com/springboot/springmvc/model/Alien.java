package com.springboot.springmvc.model;

public class Alien {

	int aid;
	String aname;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String name) {
		this.aname = name;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + aname + "]";
	}

}

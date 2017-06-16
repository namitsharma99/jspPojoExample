package com.java;

public class MyPojo {

	private String info;

	public String getInfo() {
		System.out.println("Getter called!");
		return info;
	}

	public void setInfo(String info) {
		System.out.println("Setter called!");
		this.info = info;
	}

}

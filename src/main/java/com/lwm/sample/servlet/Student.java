package com.lwm.sample.servlet;

public class Student {
	private String indexNumber;
	private String name;
	
	public String getIndexNumber() {
		return indexNumber;
	}
	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{ \"indexNumber\": \"" + indexNumber + "\", \"name\" : \"" + name + "\"}";
	}
}

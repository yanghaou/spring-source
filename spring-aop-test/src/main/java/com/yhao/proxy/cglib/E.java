package com.yhao.proxy.cglib;

public class E extends C implements D {
	@Override
	public String d() {
		System.out.println("EEEEEE");
		return "eeeee";
	}
}

package com.yhao.proxy.jdk;

public class A implements T {
	@Override
	public void t1() {
		System.out.println("A-t1");
	}

	@Override
	public String t2() {
		System.out.println("A-t2");
		return "t2t2";
	}
}

package com.yhao.proxy.jdk;

public class Test {
	public static void main(String[] args) {
		t1();
	}

	public static void t1() {
		T a = new A();
		ProxyJdk proxyJdk = new ProxyJdk();
		proxyJdk.setTarget(a);
		T proxy = proxyJdk.createProxy();
		String r = proxy.t2();
		System.out.println();
	}
}

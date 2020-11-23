package com.yhao.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

public class TestCglib {
	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "t");
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(E.class);
		enhancer.setCallback(new MyMethodInterceptor());
		E proxy = (E) enhancer.create();
		String r = proxy.d();
		System.out.println();
	}
}

package com.yhao.service;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

	public void t1() {
		System.out.println("o1------------");
	}

	public void t2(int i) {
		System.out.println("o2------------");
	}
	public void t2(String i) {
		System.out.println("t3------------");
	}

	public void t3(String i) {
		System.out.println("o3------------");
	}
}

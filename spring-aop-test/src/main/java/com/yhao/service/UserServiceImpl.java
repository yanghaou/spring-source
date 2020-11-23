package com.yhao.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	public void t1() {
		System.out.println("t1------------");
	}

	@Override
	public void t2(int i) {
		System.out.println("t2------------");
	}

	@Override
	public void t3(String i) {
		System.out.println("t3------------");
	}
}

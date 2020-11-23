package com.yhao.service;

import org.springframework.stereotype.Component;

//@MyFilter
@Component
public class MyWithinAnnotationService {

	@MyFilter
	public String m1(String  s) {
		System.out.println("sssss");
		return s;
	}
}

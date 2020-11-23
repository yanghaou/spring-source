package com.yhao;


import com.yhao.config.AppConfig;
import com.yhao.service.MyWithinAnnotationService;
import com.yhao.service.OrderService;
import com.yhao.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserService userService = context.getBean("userService",UserService.class);
//		userService.t3("ss");
		System.out.println("=====================");

//		OrderService orderService = context.getBean(OrderService.class);
//		orderService.t2("12");

		MyWithinAnnotationService myWithinAnnotationService = context.getBean(MyWithinAnnotationService.class);
		myWithinAnnotationService.m1("12");
//
//		System.out.println();
	}
}

package com.yhao.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AopAspect {

	/**
	 * 方法执行之前执行
	 */
	@Before("execution(* com.yhao.service.OrderService.t1(..))")
	public void p1() {
		System.out.println("user aop----------");
	}

	/**
	 * 方法执行之后执行
	 */
	@After("execution(* com.yhao.service.OrderService.t1(..))")
	public void p2(){
		System.out.println("order aop----------");
	}

	/**
	 * 1、within 对包中所有方法执行前执行
	 * 2、@within(annotation) 对指定注解进行拦截
	 *
	 * @within会匹配到标注了指定注解的类，并且在该类的子类中，那些没有重写的父类方法也会被匹配到。
	 * @target只匹配标注了指定注解的类。不涉及任何其他类。
	 */
	@After("target(com.yhao.service.OrderService)")
	public void p3(){
		System.out.println("with target aop----------");
	}

	@After("@within(org.springframework.stereotype.Service)")
	public void p4(){
		System.out.println("within aop----------");
	}

//	@Around("@within(com.yhao.service.MyFilter)")
	public void p5(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("before within around aop----------");
		Object obj = joinPoint.proceed();
		System.out.println("result :"+obj);
		System.out.println("after within around aop----------");
	}


	/**
	 * @annotation 对方法上指定注解生效
	 *
	 */
	@Around("@annotation(com.yhao.service.MyFilter)")
	public void p7(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("before annotation around aop----------");
		Object obj = joinPoint.proceed();
		System.out.println("result :"+obj);
		System.out.println("after annotation around aop----------");
	}


	/**
	 * 方法执行之前执行
	 */
//	@Before("args(* com.yhao.service.OrderService.t2(java.lang.String))")
	public void p6() {
		System.out.println("args aop----------");
	}


}

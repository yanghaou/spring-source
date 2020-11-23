package com.yhao.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyJdk implements InvocationHandler {
	private T target;

	public void setTarget(T target) {
		this.target = target;
	}


	public T createProxy() {
		return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
	}

	/**
	 *在执行被代理对应的任何方法时都会被调用
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开始执行");
		Object o =  method.invoke(target, args);
		System.out.println("执行结果");
		return o;
	}



}

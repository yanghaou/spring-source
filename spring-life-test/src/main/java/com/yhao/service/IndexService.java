package com.yhao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {
	@Autowired
	UserService userService;

}

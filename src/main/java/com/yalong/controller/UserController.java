package com.yalong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yalong.po.User;
import com.yalong.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("{id}")
	@ResponseBody
	public User findUser(@PathVariable Integer id)
	{
		return userService.queryUserById(id);
	}

}

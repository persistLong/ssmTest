package com.yalong.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yalong.mapper.UserMapper;
import com.yalong.po.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public User queryUserById(Integer id) {
		return id == null ? null : mapper.selectByPrimaryKey(id);
	}
	
}


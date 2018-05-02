package cn.bdqn.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User getBy(String userName, String password) {
		User user = userMapper.getBy(userName, password);
		return user;
	}

}

package cn.bdqn.service;

import cn.bdqn.pojo.User;

/**
 * 用户业务操作
 */
public interface UserService {
	
	/**
	 * 验证用户是否存在
	 */
	public User getBy(String userName,String password);
	
}

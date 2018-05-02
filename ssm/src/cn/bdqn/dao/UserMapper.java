package cn.bdqn.dao;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.User;

/**
 * 用户的数据操作
 */
public interface UserMapper {

	/**
	 * 根据用户名和密码查询用户
	 */
	public User getBy(@Param("userName") String userName,@Param("userPassword") String userPassword);
	
}

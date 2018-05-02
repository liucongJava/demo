package cn.bdqn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bdqn.define.Constant;
import cn.bdqn.pojo.User;
import cn.bdqn.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	//跳转到用户登录界面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//登录操作
	@RequestMapping("/doLogin")
	public String doLogin(User user,HttpSession session) {
		if(user!=null) {
			User _user = userService.getBy(user.getUserName(), user.getUserPassword());
			if(_user!=null) {
				session.setAttribute(Constant.USER.USERSESSION, _user);
				return "redirect:/index/main";
			}else {
				return "login";
			}
		}else {
			return "login";
		}
	}
	
}

package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index1") 
public class IndexController {
	
	@RequestMapping("/main")
	public String main() {
		return "main/main";
	}
	
}

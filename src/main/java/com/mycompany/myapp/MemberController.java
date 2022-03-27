package com.mycompany.myapp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Member")
public class MemberController {

	@Autowired
	public HttpSession session;
	
	@RequestMapping("MemberSignUp")
	public String MemberSignUp(String name, String pass, int age) {
		return "redirect: /";
	}
}

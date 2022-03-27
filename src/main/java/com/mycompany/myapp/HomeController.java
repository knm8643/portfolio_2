package com.mycompany.myapp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.MemberDAO;
import service.MemberService;

@Controller
public class HomeController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired(required=true)
	private MemberService memberService;
	
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("Login")
	public String Login(String name, String pass) {
		System.out.println(name + pass);
		
		int result = memberService.login(name, pass);
		System.out.println(result);
		return "redirect: /";
	}
	
	@RequestMapping("LogOut")
	public String LogOut() {
		session.invalidate();
		return "redirect: /";
	}
	
	@RequestMapping("SignUp")
	public String SignUp() {
		return "/member/SignUp";
	}
	
	@RequestMapping("Update")
	public String Update() {
		return "/member/Update";
	}
	
	@RequestMapping("BoardList")
	public String BoardList() {
		return "/board/BoardList";
	}
		
}

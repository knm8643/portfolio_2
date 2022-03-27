package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDAO;

@Service
public class MemberService{
   
	@Autowired
	public MemberDAO memberDAO;
	
	public int login(String name, String pass) {
		System.out.println("¼­ºñ½º" + name + pass);
		return memberDAO.login(name, pass);
	}
	
}

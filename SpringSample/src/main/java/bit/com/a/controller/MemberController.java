package bit.com.a.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bit.com.a.dto.MemberDto;
import bit.com.a.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService service;
	
	
	@RequestMapping(value = "/idcheck", method = {RequestMethod.GET,RequestMethod.POST})
	public String idcheck(String id) {
		System.out.println("idcheck " + new Date() );
		
		String chk = "";
		int a = service.getId(id);
		if(a>0) { chk="n"; }
		else { chk="y"; }
		return chk;
	}
	
	@RequestMapping(value = "/regiAF", method = {RequestMethod.GET,RequestMethod.POST})
	public String regiAF(MemberDto dto) {
		System.out.println("regiAF " + new Date() );
		System.out.println(dto.toString());
		
		String chk = "";
		int a = service.addMember(dto);
		if(a>0) { chk="y"; }
		else { chk="n"; }
		return chk;
	}
	
	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	public MemberDto login(MemberDto dto, HttpServletRequest req) {
		System.out.println("login " + new Date() );
		System.out.println(dto.toString());
		
		MemberDto mem = service.login(dto);
		if(mem != null && !mem.getId().equals("")) {
			req.getSession().setAttribute("login", mem);
			req.getSession().setMaxInactiveInterval(60*60*24); //로그인 섹션 시간 주기
			System.out.println("2번째:"+mem.toString());
		}
		
		return mem;
	}
	
	
	
}

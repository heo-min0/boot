package bit.com.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bit.com.a.dto.MemberDto;
import bit.com.a.service.MemberService;

@RestController		//어노테이션 의 컨트롤러와 리스폰스 바디를 합친것은 Restful이라고 한다 이걸 레스트 컨트롤러
public class HelloController {

	@Autowired
	MemberService service;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String base() {
		System.out.println("HelloController test" + new Date() );
		
		return "base";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		System.out.println("HelloController test" + new Date() );
		
		return "test";
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public MemberDto getMember() {
		System.out.println("HelloController getMember" + new Date() );
		
		MemberDto dto = new MemberDto("aaa","111","홍길동","aaa@naver.com",3);
		return dto;
	}
	
	@RequestMapping(value = "/conn_param", method = RequestMethod.GET)
	public String conn_param(String title) {
		System.out.println("HelloController conn_param" + new Date() );
		System.out.println("title : " + title );
		return "conn_success"+title;
	}
	
	@RequestMapping(value = "/conn_param_get", method = RequestMethod.GET)
	public String conn_param_get(MemberDto dto) {
		System.out.println("HelloController conn_param_get" + new Date() );
		System.out.println(dto.toString() );
		
		return dto.toString();
	}
	
	@RequestMapping(value = "/dbtest", method = RequestMethod.GET)
	public List<MemberDto> dbtest() {
		System.out.println("HelloController dbtest" + new Date() );
		
		List<MemberDto> list = service.allMember();
		return list;
	}
	
	
	
	
}









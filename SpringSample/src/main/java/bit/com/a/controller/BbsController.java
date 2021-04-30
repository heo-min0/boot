package bit.com.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bit.com.a.dto.BbsDto;
import bit.com.a.dto.BbsParam;
import bit.com.a.service.BbsService;

@RestController
public class BbsController {

	@Autowired
	BbsService service;
	
	
	@RequestMapping(value = "/bbslist", method = {RequestMethod.GET,RequestMethod.POST})
	public List<BbsDto> bbslist(BbsParam param) {
		System.out.println("bbslist " + new Date() );
		System.out.println(param.toString());
		
		//paging 처리
		int sn = param.getPage();
		int start = sn*10 + 1;
		int end = sn*10 + 10;
		
		param.setStart(start);
		param.setEnd(end);
		
		List<BbsDto> list = service.bbsList(param);
		
		return list;
	}
	
	
	@RequestMapping(value = "/bbslistCount", method = {RequestMethod.GET,RequestMethod.POST})
	public int bbslistCount(BbsParam param) {
		System.out.println("bbslistCount " + new Date() );
		System.out.println(param.toString());
		
		return service.getBbsCount(param);
	}
	
	@RequestMapping(value = "/getBbs", method = {RequestMethod.GET,RequestMethod.POST})
	public BbsDto getBbs(int seq) {
		System.out.println("getBbs " + new Date() );
		System.out.println("seq:"+seq);
		
		service.readCount(seq); //조회수 증가
		
		return service.getBbs(seq);
	}
	
	@RequestMapping(value = "/writeBbs", method = {RequestMethod.GET,RequestMethod.POST})
	public int writeBbs(BbsDto dto) {
		System.out.println("writeBbs " + new Date() );
		System.out.println(dto.toString());
		
		return service.writeBbs(dto);
	}
	
	@RequestMapping(value = "/updateBbs", method = {RequestMethod.GET,RequestMethod.POST})
	public int updateBbs(BbsDto dto) {
		System.out.println("updateBbs " + new Date() );
		System.out.println(dto.toString());
		
		return service.updateBbs(dto);
	}
	
	@RequestMapping(value = "/deleteBbs", method = {RequestMethod.GET,RequestMethod.POST})
	public int deleteBbs(int seq) {
		System.out.println("deleteBbs " + new Date() );
		System.out.println("seq:"+seq);
		return service.deleteBbs(seq); 
	}
	
	@RequestMapping(value = "/replyBbs", method = {RequestMethod.GET,RequestMethod.POST})
	public int replyBbs(BbsDto dto) {
		System.out.println("replyBbs " + new Date() );
		System.out.println(dto.toString());
		
		return service.replyBbs(dto); 
	}
	
}

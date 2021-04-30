package bit.com.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bit.com.a.dto.PdsDto;
import bit.com.a.service.PdsService;

@RestController
public class PdsController {

	@Autowired
	PdsService service;
	
	@RequestMapping(value = "/getPdsList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<PdsDto> getPdsList() {
		System.out.println("getPdsList " + new Date() );

		List<PdsDto> list = service.getPdsList();
		
		return list;
	}
	
	@RequestMapping(value = "/uploadPds", method = {RequestMethod.GET,RequestMethod.POST})
	public int uploadPds(PdsDto dto) {
		System.out.println("uploadPds " + new Date() );
		System.out.println(dto.toString());
		return service.uploadPds(dto);
	}
	
	@RequestMapping(value = "/getPds", method = {RequestMethod.GET,RequestMethod.POST})
	public PdsDto getPds(int seq) {
		System.out.println("getPds "+seq+" "+ new Date() );

		return service.getPds(seq);
	}
	
	@RequestMapping(value = "/delPds", method = {RequestMethod.GET,RequestMethod.POST})
	public int delPds(int seq) {
		System.out.println("delPds "+seq+" "+ new Date() );

		return service.delPds(seq);
	}
	
	@RequestMapping(value = "/updatePds", method = {RequestMethod.GET,RequestMethod.POST})
	public int updatePds(PdsDto dto) {
		System.out.println("updatePds " + new Date() );
		System.out.println(dto.toString());
		return service.updatePds(dto);
	}
	
	
}

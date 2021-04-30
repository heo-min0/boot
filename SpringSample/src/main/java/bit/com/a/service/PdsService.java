package bit.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bit.com.a.dao.PdsDao;
import bit.com.a.dto.PdsDto;

@Service
@Transactional
public class PdsService {

	@Autowired
	private PdsDao dao;
	
	public List<PdsDto> getPdsList(){
		return dao.getPdsList();
	}
	
	public int uploadPds(PdsDto dto){
		return dao.uploadPds(dto);
	}
	
	public PdsDto getPds(int seq){
		return dao.getPds(seq);
	}
	
	public int delPds(int seq){
		return dao.delPds(seq);
	}
	
	public int updatePds(PdsDto dto){
		return dao.updatePds(dto);
	}
}

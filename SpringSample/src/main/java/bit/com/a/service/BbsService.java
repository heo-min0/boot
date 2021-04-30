package bit.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bit.com.a.dao.BbsDao;
import bit.com.a.dto.BbsDto;
import bit.com.a.dto.BbsParam;

@Service
@Transactional
public class BbsService {

	@Autowired
	private BbsDao dao;
	
	public List<BbsDto> bbsList(BbsParam param){
		return dao.bbsList(param);
	}
	
	public int getBbsCount(BbsParam param){
		return dao.getBbsCount(param);
	}
	
	public BbsDto getBbs(int seq){
		return dao.getBbs(seq);
	}
	
	public int writeBbs(BbsDto dto) {
		return dao.writeBbs(dto);
	}
	
	public int updateBbs(BbsDto dto){
		return dao.updateBbs(dto);
	}
	
	public int deleteBbs(int seq){
		return dao.deleteBbs(seq);
	}
	
	public int replyBbs(BbsDto dto){
		int a = dao.replyBbsUpdate(dto);
		int b = dao.replyBbsInsert(dto);
		return a>0||b>0?1:0;
	}
	
	public int readCount(int seq){
		return dao.readCount(seq);
	}
	
}

package bit.com.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bit.com.a.dao.MemberDao;
import bit.com.a.dto.MemberDto;

@Service
@Transactional
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	public int getId(String id) {
		return dao.getId(id);
	}
	
	public int addMember(MemberDto dto) {
		return dao.addMember(dto);
	}
	
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}
	
}

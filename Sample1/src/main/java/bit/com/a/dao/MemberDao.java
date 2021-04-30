package bit.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.MemberDto;

@Mapper
@Repository
public interface MemberDao {
	
				// xml 이름이랑 똑같아야 
	public List<MemberDto> allMember();
	
	
	
}

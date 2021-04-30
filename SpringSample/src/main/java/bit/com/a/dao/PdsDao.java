package bit.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.PdsDto;

@Mapper
@Repository
public interface PdsDao {

	public List<PdsDto> getPdsList();
	public int uploadPds(PdsDto dto);
	public PdsDto getPds(int seq);
	public int delPds(int seq);
	public int updatePds(PdsDto dto);
	
}

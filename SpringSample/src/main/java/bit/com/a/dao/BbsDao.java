package bit.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import bit.com.a.dto.BbsDto;
import bit.com.a.dto.BbsParam;

@Mapper
@Repository
public interface BbsDao {

	public List<BbsDto> bbsList(BbsParam param);
	public int getBbsCount(BbsParam param);
	public BbsDto getBbs(int seq);
	public int writeBbs(BbsDto dto);
	public int updateBbs(BbsDto dto);
	public int deleteBbs(int seq);
	public int replyBbsUpdate(BbsDto dto);
	public int replyBbsInsert(BbsDto dto);
	public int readCount(int seq);
	
}

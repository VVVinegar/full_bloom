package FullBloom.dao;

import FullBloom.pojo.Party_info;
import FullBloom.pojo.Party_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Party_infoMapper {
    long countByExample(Party_infoExample example);

    int deleteByExample(Party_infoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Party_info record);

    int insertSelective(Party_info record);

    List<Party_info> selectByExampleWithBLOBs(Party_infoExample example);

    List<Party_info> selectByExample(Party_infoExample example);

    Party_info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Party_info record, @Param("example") Party_infoExample example);

    int updateByExampleWithBLOBs(@Param("record") Party_info record, @Param("example") Party_infoExample example);

    int updateByExample(@Param("record") Party_info record, @Param("example") Party_infoExample example);

    int updateByPrimaryKeySelective(Party_info record);

    int updateByPrimaryKeyWithBLOBs(Party_info record);

    int updateByPrimaryKey(Party_info record);
}
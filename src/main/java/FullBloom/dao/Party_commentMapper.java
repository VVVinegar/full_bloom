package FullBloom.dao;

import FullBloom.pojo.Party_comment;
import FullBloom.pojo.Party_commentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Party_commentMapper {
    long countByExample(Party_commentExample example);

    int deleteByExample(Party_commentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Party_comment record);

    int insertSelective(Party_comment record);

    List<Party_comment> selectByExample(Party_commentExample example);

    Party_comment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Party_comment record, @Param("example") Party_commentExample example);

    int updateByExample(@Param("record") Party_comment record, @Param("example") Party_commentExample example);

    int updateByPrimaryKeySelective(Party_comment record);

    int updateByPrimaryKey(Party_comment record);
}
package FullBloom.dao;

import FullBloom.pojo.Party_picture;
import FullBloom.pojo.Party_pictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Party_pictureMapper {
    long countByExample(Party_pictureExample example);

    int deleteByExample(Party_pictureExample example);

    int insert(Party_picture record);

    int insertSelective(Party_picture record);

    List<Party_picture> selectByExample(Party_pictureExample example);

    int updateByExampleSelective(@Param("record") Party_picture record, @Param("example") Party_pictureExample example);

    int updateByExample(@Param("record") Party_picture record, @Param("example") Party_pictureExample example);
}
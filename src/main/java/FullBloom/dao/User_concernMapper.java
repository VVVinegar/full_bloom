package FullBloom.dao;

import FullBloom.pojo.User_concern;
import FullBloom.pojo.User_concernExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_concernMapper {
    long countByExample(User_concernExample example);

    int deleteByExample(User_concernExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User_concern record);

    int insertSelective(User_concern record);

    List<User_concern> selectByExample(User_concernExample example);

    User_concern selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User_concern record, @Param("example") User_concernExample example);

    int updateByExample(@Param("record") User_concern record, @Param("example") User_concernExample example);

    int updateByPrimaryKeySelective(User_concern record);

    int updateByPrimaryKey(User_concern record);
}
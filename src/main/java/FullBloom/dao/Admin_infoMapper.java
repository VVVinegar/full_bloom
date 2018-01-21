package FullBloom.dao;

import FullBloom.pojo.Admin_info;
import FullBloom.pojo.Admin_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Admin_infoMapper {
    long countByExample(Admin_infoExample example);

    int deleteByExample(Admin_infoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin_info record);

    int insertSelective(Admin_info record);

    List<Admin_info> selectByExample(Admin_infoExample example);

    Admin_info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Admin_info record, @Param("example") Admin_infoExample example);

    int updateByExample(@Param("record") Admin_info record, @Param("example") Admin_infoExample example);

    int updateByPrimaryKeySelective(Admin_info record);

    int updateByPrimaryKey(Admin_info record);
}
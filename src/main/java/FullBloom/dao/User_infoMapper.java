package FullBloom.dao;

import FullBloom.pojo.User_info;
import FullBloom.pojo.User_infoExample;

import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface User_infoMapper {
    long countByExample(User_infoExample example);

    int deleteByExample(User_infoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User_info record);

    int insertSelective(User_info record);

    List<User_info> selectByExample(User_infoExample example);

    User_info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User_info record, @Param("example") User_infoExample example);

    int updateByExample(@Param("record") User_info record, @Param("example") User_infoExample example);

    int updateByPrimaryKeySelective(User_info record);

    int updateByPrimaryKey(User_info record);

    User_info selectByNickname(@Param("nickname") String nickname);

    int insertForRegister(@Param("nickName") String nickname, @Param("password") String password,
                          @Param("createTime") Timestamp createTime, @Param("status") Integer status);
}
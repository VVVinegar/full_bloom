package FullBloom.service_impl;

import FullBloom.dao.User_infoMapper;
import FullBloom.pojo.User_info;
import FullBloom.service.RegisterService;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by 759517209@qq.com on 2017/9/10.
 */
@Service("RegisterService")
public class RegisterServiceImpl implements RegisterService{

    @Resource
    User_infoMapper user_infoMapper;

    public boolean register(String nickname, String password) {
        try {
            String md5_password = DigestUtils.md5DigestAsHex(password.getBytes());
            Date date = new Date();
            Timestamp timeStamp = new Timestamp(date.getTime());

            User_info user_login = new User_info();
            user_login.setNickName(nickname);
            user_login.setPassword(md5_password);
            user_login.setCreateTime(timeStamp);
            user_login.setStatus(1);
            if (user_infoMapper.insertSelective(user_login)>0){
                return true;
            }else {
                return false;
            }
        } catch (Exception e){
            return false;
        }
    }

    public boolean isExist(String nickname){
        User_info user_info = user_infoMapper.selectByNickname(nickname);
        if (user_info == null){
            return false;
        }
        return true;
    }

}

package FullBloom.service_impl;

import FullBloom.dao.User_infoMapper;
import FullBloom.pojo.User_info;
import FullBloom.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

/**
 * Created by 759517209@qq.com on 2017/9/8.
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    User_infoMapper user_infoMapper;

    public boolean verify(String nickname, String password) {
        User_info user_info = user_infoMapper.selectByNickname(nickname);
        if(user_info != null){
            String md5_password = DigestUtils.md5DigestAsHex(password.getBytes());
            if(user_info.getPassword().equals(md5_password)  && user_info.getNickName().equals(nickname)){
                return true;
            }
        }
        return false;
    }
}

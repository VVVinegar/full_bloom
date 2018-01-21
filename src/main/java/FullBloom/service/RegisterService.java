package FullBloom.service;

/**
 * Created by 759517209@qq.com on 2017/9/10.
 */
public interface RegisterService {
    public boolean isExist(String nickname);
    public boolean register(String nickname, String password);
}

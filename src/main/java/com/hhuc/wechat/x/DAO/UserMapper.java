package com.hhuc.wechat.x.DAO;
import com.hhuc.wechat.x.Models.User;

import java.util.List;

public interface UserMapper {
    public User queryOpenid(String openid);
    public int updateUserIfNecessary(User user);
    public void updateUser(User user);
    public void addUser(User user);


}

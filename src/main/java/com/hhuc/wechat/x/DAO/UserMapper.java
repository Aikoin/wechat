package com.hhuc.wechat.x.DAO;
import com.hhuc.wechat.x.Models.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryOpenid(String openid);
}

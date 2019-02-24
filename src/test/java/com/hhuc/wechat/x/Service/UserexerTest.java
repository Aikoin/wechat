package com.hhuc.wechat.x.Service;

import com.hhuc.wechat.x.DAO.Userexer;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @program: Wechat_1
 * @description:
 * @author: LYX
 * @create: 2019-02-24 09:14
 **/

public class UserexerTest {
    @Test
    public void queryOpenid() throws IOException {
        String openid = "15";
        String[] data = {openid};
        Userexer userexer = new Userexer(data);
        String res = userexer.queryOpenid();
        Assert.assertEquals(6, res);
    }
}
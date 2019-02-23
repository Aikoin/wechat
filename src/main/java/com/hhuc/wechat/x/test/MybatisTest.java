package com.hhuc.wechat.x.test;

import com.hhuc.wechat.x.DAO.UserMapper;
import com.hhuc.wechat.x.Models.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: Wechat_1
 * @description: 测试
 * @author: LYX
 * @create: 2019-02-23 16:52
 **/
public class MybatisTest {


    public static void main(String []args) throws IOException {
        String resource = "com/hhuc/wechat/x/conf/mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper Mapper= session.getMapper(UserMapper.class);
            User user= Mapper.queryOpenid("15").get(0);
            System.out.println(user);
        } finally {
            session.close();
        }



    }
}

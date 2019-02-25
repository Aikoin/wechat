package com.hhuc.wechat.x.DAO;

import com.hhuc.wechat.x.Models.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: Wechat_1
 * @description:
 * @author: LYX
 * @create: 2019-02-23 19:33
 **/
public class Userexer<sout> {

    private String parameters[];
    public Userexer(String Parameters[]) {
        parameters = Parameters;
    }
    public String getOpenid() {
        return parameters[0];//
    }
    private User user;
    public String queryOpenid() throws IOException {
        SqlSession session = getSqlSession();
        String openid =getOpenid();

        try {
            UserMapper Mapper = session.getMapper(UserMapper.class);
            user = Mapper.queryOpenid(openid).get(0);
            System.out.println(user);
        } finally {
            session.close();
        }
        return user.toString();
    }

    private SqlSession getSqlSession() throws IOException {
        String resource = "com/hhuc/wechat/x/conf/mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }
}
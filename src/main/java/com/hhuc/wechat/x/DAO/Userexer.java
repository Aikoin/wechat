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
    public Userexer(User user) {
        this.user =user;
    }


    private int res;
    private User user;
    private SqlSession getSqlSession() throws IOException {
        String resource = "com/hhuc/wechat/x/conf/mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

//    public String modifyPersonData() throws IOException {
//        SqlSession session = getSqlSession();
//        String openid =getOpenid();
//        String phone =getPhone();
//        String province =getProvince();
//        String city =getCity();
//        String language =getLanguage();
//        String avatarUrl =getAvatarUrl();
//
//        try {
//            UserMapper Mapper = session.getMapper(UserMapper.class);
//            res = Mapper.updateUserIfNecessary();
//            System.out.println(res);
//        } finally {
//            session.close();
//        }
//        return "修改成功"+res;
//    }

    public String queryOpenid() throws IOException {
        SqlSession session = getSqlSession();

        try {
            UserMapper Mapper = session.getMapper(UserMapper.class);
            user = Mapper.queryOpenid(user.getOpenid());
            System.out.println(user);
        } finally {
            session.close();
        }
        return user.toString();
    }

    public String updateUser() throws IOException {
        SqlSession session = getSqlSession();
        

        try {
            UserMapper Mapper = session.getMapper(UserMapper.class);
            System.out.println(            user.toString()
            );
            Mapper.updateUser(user);
            session.commit();
            System.out.println("修改完成");
        } finally {

            session.close();
        }
        return user.toString();
    }

    public String addUser() throws IOException {
        SqlSession session = getSqlSession();
        try {
            UserMapper Mapper = session.getMapper(UserMapper.class);
            Mapper.addUser(user);
            session.commit();
            System.out.println("增加完成");
        } finally {
            session.close();
        }
        return user.toString();
    }

}
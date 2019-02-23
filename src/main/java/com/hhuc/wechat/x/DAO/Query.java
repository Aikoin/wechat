package com.hhuc.wechat.x.DAO;

import com.hhuc.wechat.x.Models.User;

import java.sql.*;

/**
 * @program: pt
 * @description: 查询类
 * @author: LYX
 * @create: 2019-02-20 15:22
 **/
public class Query {
    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://118.25.176.99:3306/fw?useSSL=false&useUnicode=true&characterEncoding=UTF-8";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123456";
    static String res;

    public String getOpenid() {
        return parameters[0];//
    }

    private String parameters[];

    public Query(String Parameters[]) {
        parameters = Parameters;
    }

    public String query_openid() {
        String openid=getOpenid();
        System.out.println(openid);
        Connection conn = null;
        Statement stmt = null;

        try {
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT user.openid,user.nickname FROM user WHERE user.openid =" + openid;
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while (rs.next()) {
                // 通过字段检索
                User u = new User();
                u.setOpenid(rs.getString("openid"));
                u.setNickname(rs.getString("nickname"));
                res = u.toString();

                System.out.print(u.toString());
                // 输出数据

                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
        return res;
    }
}
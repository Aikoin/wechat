package com.hhuc.wechat.x.Service;
/**
 * @program: pt
 * @description: id
 * @author: LYX
 * @create: 2019-02-22 17:10
 **/
import com.hhuc.wechat.x.DAO.Userexer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: pt
 * @description: 写入用户基本信息
 * @author: LYX
 * @create: 2019-02-20 16:06
 **/

public class Qubi  extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Qubi  () {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        // 处理中文
        String openid = new String(request.getParameter("openid").getBytes("ISO8859-1"), "UTF-8");

        String []data={openid};
//        Query q = new Query(data);
//
//        String res = q.query_openid();
        Userexer userexer = new Userexer(data);
        System.out.println(data[0]);
        String res = userexer.queryOpenid();
        out.println(res);
    }

    // 处理 POST 方法请求的方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
package com.hhuc.wechat.x.Service;

/**
 * @program: Wechat_1
 * @description: log
 * @author: LYX
 * @create: 2019-02-24 09:52
 **/


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.Test;


public class Log4jInitServlte extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = -865926669490098235L;

    public Log4jInitServlte() {
        super();
    }

    /**
     * 初始化Servlet
     */

    public void init() throws ServletException {
        Logger logger = Logger.getLogger(Log4jInitServlte.class);

    }
}
package com.hhuc.wechat.x.DAO;


/**
 * @program: Wechat_1
 * @description: code2Session   接受code 返回openid等，实现登录
 * @author: LYX
 * @create: 2019-02-22 21:03
 **/

import com.hhuc.wechat.x.Models.Code2Session;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.*;


public class Login_request  {
    private String url = "https://api.weixin.qq.com/sns/jscode2session";
    private String APPID = "wxb38f5ff2890d8cbf";
    private String SECRET = "476a09e87fb7f68b8aba2cc86dafb14e";
    private String JSCODE = "023og0EI16LmI10KAIDI1N3HDI1og0EX";
    private String authorization_code = "authorization_code";


    public void setJSCODE(String JSCODE) {
        this.JSCODE = JSCODE;
    }

    public Login_request(String code) {
        super();
        setJSCODE(code);
    }


    public String Code2Session() {
        String response = HttpRequest.get(url,true,"appid",APPID,"secret",SECRET,"js_code",JSCODE,"grant_type",authorization_code).body();
        System.out.println("Response was: " + response);
        Gson gson = new Gson();
        Code2Session j = gson.fromJson(response, Code2Session.class);
        String json = j.toString();
        System.out.println(json);
        return json;
    }


}
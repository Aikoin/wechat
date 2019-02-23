package com.hhuc.wechat.x.test;
/**
 * @program: Wechat_1
 * @description: hhtp
 * @author: LYX
 * @create: 2019-02-22 19:35
 **/

import com.hhuc.wechat.x.Models.Code2Session;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.*;
public class Request {

    public static void main(String []args) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        String APPID="wxb38f5ff2890d8cbf";
        String SECRET ="476a09e87fb7f68b8aba2cc86dafb14e";
        String JSCODE="023og0EI16LmI10KAIDI1N3HDI1og0EX";
        String authorization_code="authorization_code";
        String response = HttpRequest.get(url,true,"appid",APPID,"secret",SECRET,"js_code",JSCODE,"grant_type",authorization_code).body();
        System.out.println("Response was: " + response);
        Gson gson = new Gson();
        Code2Session j = gson.fromJson(response,Code2Session.class);
        String s=  j.toString();
        System.out.println(s);






    }

}
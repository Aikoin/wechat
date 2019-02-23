package com.hhuc.wechat.x.Models;

/**
 * @program: Wechat_1
 * @description: 小程序登录的json  bean 类
 * @author: LYX
 * @create: 2019-02-22 20:30
 **/
public class Code2Session {
    private String  openid;
    private String	session_key;
    private String	unionid;
    private String	errcode_number;
    private String errmsg	;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getErrcode_number() {
        return errcode_number;
    }

    public void setErrcode_number(String errcode_number) {
        this.errcode_number = errcode_number;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"openid\":\"")
                .append(openid).append('\"');
        sb.append(",\"session_key\":\"")
                .append(session_key).append('\"');
        sb.append(",\"unionid\":\"")
                .append(unionid).append('\"');
        sb.append(",\"errcode_number\":\"")
                .append(errcode_number).append('\"');
        sb.append(",\"errmsg\":\"")
                .append(errmsg).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
package com.hhuc.wechat.x.Models;

/**
 * @program: pt
 * @description: 用户模型
 * @author: LYX
 * @create: 2019-02-20 15:44
 **/
public class User {

    private String openid;
    private String unionid;
    private String phone;
    private String city;
    private String province;
    private String country;
    private String avatarUrl;
    private String language;
    private String role;
    public String getNickname() { return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private String nickname;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"openid\":\"")
                .append(openid).append('\"');
        sb.append(",\"unionid\":\"")
                .append(unionid).append('\"');
        sb.append(",\"phone\":\"")
                .append(phone).append('\"');
        sb.append(",\"city\":\"")
                .append(city).append('\"');
        sb.append(",\"province\":\"")
                .append(province).append('\"');
        sb.append(",\"country\":\"")
                .append(country).append('\"');
        sb.append(",\"avatarUrl\":\"")
                .append(avatarUrl).append('\"');
        sb.append(",\"language\":\"")
                .append(language).append('\"');
        sb.append(",\"role\":\"")
                .append(role).append('\"');
        sb.append(",\"nickname\":\"")
                .append(nickname).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
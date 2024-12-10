package org.example.domain;

import java.util.Date;
import java.util.Objects;

/**
 * @Author yeyc
 * @Description 描述类的作用
 * @Date 2024/12/10
 * @Param
 * @Exception
 **/
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String headImg;
    private String phone;
    private Date createTime;
    private String wechat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", headImg='" + headImg + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", wechat='" + wechat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getName(), user.getName()) && Objects.equals(getPwd(), user.getPwd()) && Objects.equals(getHeadImg(), user.getHeadImg()) && Objects.equals(getPhone(), user.getPhone()) && Objects.equals(getCreateTime(), user.getCreateTime()) && Objects.equals(getWechat(), user.getWechat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPwd(), getHeadImg(), getPhone(), getCreateTime(), getWechat());
    }
}

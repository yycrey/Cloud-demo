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
public class Video {
    private Integer id;
    private String title;
    private String summary;
    private String coverImg;
    private Integer  price;
    private Date createTime;
    private Double point;
    
    /**
     * @Description: 记录服务器信息
     * @Param: 
     * @Return: 
     * @Author: yeyc
     * @Date: 2024/12/11
     */
    private String serviceInfo;

    public String getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(String serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", point=" + point +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        Video video = (Video) o;
        return Objects.equals(getId(), video.getId()) && Objects.equals(getTitle(), video.getTitle()) && Objects.equals(getSummary(), video.getSummary()) && Objects.equals(getCoverImg(), video.getCoverImg()) && Objects.equals(getPrice(), video.getPrice()) && Objects.equals(getCreateTime(), video.getCreateTime()) && Objects.equals(getPoint(), video.getPoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getSummary(), getCoverImg(), getPrice(), getCreateTime(), getPoint());
    }
}

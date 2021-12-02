package com.zhou.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 多条件查询球队封装的实体类
 */
public class QueryVO {
    private String teamName;
    private String chineseName;
    private String coach;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private Integer area;

    @Override
    public String toString() {
        return "QueryVO{" +
                "teamName='" + teamName + '\'' +
                ", chineseName='" + chineseName + '\'' +
                ", coach='" + coach + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", area=" + area +
                '}';
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
}

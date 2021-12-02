package com.zhou.pojo;

import java.util.Date;

public class Gamerecord {
    private String recordId;

    private Integer homeTeamId;

    private Date gameDate;

    private Integer score;

    private Integer visitingTeamId;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getVisitingTeamId() {
        return visitingTeamId;
    }

    public void setVisitingTeamId(Integer visitingTeamId) {
        this.visitingTeamId = visitingTeamId;
    }
}
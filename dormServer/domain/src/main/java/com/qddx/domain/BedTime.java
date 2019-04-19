package com.qddx.domain;

import java.io.Serializable;
import java.util.Date;

public class BedTime implements Serializable {
    private Integer stuid;

    private String bedtype;

    private Date beddate;

    private Integer dormid;

    private Integer roomid;

    private static final long serialVersionUID = 1L;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getBedtype() {
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype == null ? null : bedtype.trim();
    }

    public Date getBeddate() {
        return beddate;
    }

    public void setBeddate(Date beddate) {
        this.beddate = beddate;
    }

    public Integer getDormid() {
        return dormid;
    }

    public void setDormid(Integer dormid) {
        this.dormid = dormid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }
}
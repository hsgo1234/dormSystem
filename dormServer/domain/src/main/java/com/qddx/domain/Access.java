package com.qddx.domain;

import java.io.Serializable;
import java.util.Date;

public class Access implements Serializable {
    private Integer stuid;

    private String acctype;

    private Date accdate;

    private Integer dormid;

    private Integer roomid;

    private static final long serialVersionUID = 1L;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype == null ? null : acctype.trim();
    }

    public Date getAccdate() {
        return accdate;
    }

    public void setAccdate(Date accdate) {
        this.accdate = accdate;
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
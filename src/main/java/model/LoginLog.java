package model;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author FT丶Kuroko
 * @date 2018/12/23 12:31
 */
public class LoginLog implements Serializable {
    private Integer loginLogId;

    private Integer userId;

    private String ip;

    private Date loginDatetime;

    public Integer getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }
}
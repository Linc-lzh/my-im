package com.im.imclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfiguration {
    @Value("${im.user.id}")
    private Long userId;

    @Value("${im.user.userName}")
    private String userName;

    @Value("${im.msg.logger.path}")
    private String msgLoggerPath;

    @Value("${im.heartbeat.time}")
    private long heartBeatTime;

    @Value("5")
    private int errorCount;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMsgLoggerPath() {
        return msgLoggerPath;
    }

    public void setMsgLoggerPath(String msgLoggerPath) {
        this.msgLoggerPath = msgLoggerPath;
    }


    public long getHeartBeatTime() {
        return heartBeatTime;
    }

    public void setHeartBeatTime(long heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
}

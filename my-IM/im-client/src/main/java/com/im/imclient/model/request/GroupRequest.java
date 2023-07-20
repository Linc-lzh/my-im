package com.im.imclient.model.request;

import com.im.imcommon.request.BaseRequest;

import javax.validation.constraints.NotNull;

public class GroupRequest extends BaseRequest {
    @NotNull(message = "userId can't be null")
    //sender userId
    private Long userId;

    @NotNull(message = "msg can't be null")
    private String msg;

    public GroupRequest(Long userId, String msg) {
        this.userId = userId;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "GroupRequest{" +
                "userId=" + userId +
                ", msg='" + msg + '\'' +
                "} " + super.toString();
    }
}

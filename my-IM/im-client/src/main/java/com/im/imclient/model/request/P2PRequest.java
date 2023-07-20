package com.im.imclient.model.request;

import com.im.imcommon.request.BaseRequest;

import javax.validation.constraints.NotNull;

public class P2PRequest extends BaseRequest {
    @NotNull(message = "userId can't be null")
    //sender userId
    private Long userId;


    @NotNull(message = "userId can't be null")
    //receiver userId
    private Long receiveUserId;


    @NotNull(message = "msg can't be null")
    private String msg;

    public P2PRequest() {
    }

    public P2PRequest(Long userId, Long receiveUserId, String msg) {
        this.userId = userId;
        this.receiveUserId = receiveUserId;
        this.msg = msg;
    }

    public Long getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(Long receiveUserId) {
        this.receiveUserId = receiveUserId;
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
        return "P2PRequest{" +
                "userId=" + userId +
                ", msg='" + msg + '\'' +
                "} " + super.toString();
    }
}

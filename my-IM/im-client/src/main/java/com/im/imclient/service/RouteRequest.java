package com.im.imclient.service;

import com.im.imclient.model.request.GroupRequest;
import com.im.imclient.model.request.LoginRequest;
import com.im.imclient.model.request.P2PRequest;
import com.im.imclient.model.response.IMServerResponse;
import com.im.imclient.model.response.OnlineUsersResponse;

import java.util.List;

public interface RouteRequest {

    void sendGroupMsg(GroupRequest groupRequest) throws Exception;

    void sendP2PMsg(P2PRequest p2PRequest)throws Exception;

    IMServerResponse.ServerInfo getTIMServer(LoginRequest loginReqVO) throws Exception;

    List<OnlineUsersResponse.DataBodyBean> onlineUsers()throws Exception ;


    void offLine() ;
}

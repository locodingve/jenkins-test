package com.yun.jenkinstest.dto;

import java.time.LocalDateTime;

/**
 * Created by yunyun on 2021/12/09.
 */

public class JenkinsTestDtoResponse {
    private final LocalDateTime serverTime;
    private final String message;


    public JenkinsTestDtoResponse(LocalDateTime serverTime, String message){
        this.serverTime =serverTime;
        this.message = message;
    }

    public LocalDateTime getServerTime() {
        return serverTime;
    }

    public String getMessage() {
        return message;
    }
}

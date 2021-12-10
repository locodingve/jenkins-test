package com.yun.jenkinstest.controller;

import com.yun.jenkinstest.dto.JenkinsTestDtoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by yunyun on 2021/12/09.
 */

@RestController
@RequestMapping("/api/jenkins")
public class JenkinsTestController {

    @GetMapping
    public ResponseEntity<JenkinsTestDtoResponse> test(){
        return ResponseEntity.ok(new JenkinsTestDtoResponse(LocalDateTime.now(), "success"));
    }

    @GetMapping("test")
    public ResponseEntity<JenkinsTestDtoResponse> updateCodeOnGithub(){
        return ResponseEntity.ok(new JenkinsTestDtoResponse(LocalDateTime.now(), "success"));
    }

}

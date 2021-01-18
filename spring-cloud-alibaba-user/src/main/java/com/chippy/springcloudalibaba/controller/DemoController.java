package com.chippy.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.chippy.springcloudalibaba.common.response.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo controller
 *
 * @author: chippy
 * @datetime 2021-01-15 10:46
 */
@RestController
@RequestMapping("/user/demo")
public class DemoController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/getUserInfo")
    @SentinelResource(value = "getUserInfo", blockHandler = "getUserInfoBlockHandler", fallback = "getUserInfoFallback")
    public Result<String> getUserInfo(@RequestParam("userId") String userId) {
        return Result.success("测试负载均衡端口: " + port + " - 用户信息: " + userId);
    }

    public Result<String> getUserInfoBlockHandler(String userId) {
        return Result.success(userId + " - handler get user info - blockHandler");
    }

    public Result<String> getUserInfoFallback(String userId) {
        return Result.success(userId + " - handler get user info - fallback");
    }

}

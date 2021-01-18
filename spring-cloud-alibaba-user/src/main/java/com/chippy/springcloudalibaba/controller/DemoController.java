package com.chippy.springcloudalibaba.controller;

import com.chippy.core.common.utils.UUIDUtil;
import com.chippy.springcloudalibaba.common.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public Result<String> getUserInfo() {
        return Result.success("测试负载均衡端口: " + port + " - 用户信息: " + UUIDUtil.generateUuid());
    }

}

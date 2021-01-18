package com.chippy.springcloudalibaba.rpc;

import com.chippy.springcloudalibaba.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * user feign client invoker
 *
 * @author: chippy
 * @datetime: 2021-01-18 17:14
 */
@FeignClient(value = "user", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @GetMapping("/user/demo/getUserInfo")
    Result<String> getUserInfo();

}

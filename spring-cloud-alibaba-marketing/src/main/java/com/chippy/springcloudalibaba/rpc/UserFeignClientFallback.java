package com.chippy.springcloudalibaba.rpc;

import com.chippy.springcloudalibaba.common.response.Result;
import org.springframework.stereotype.Component;

/**
 * user feign client fallback
 *
 * @author: chippy
 * @datetime 2021-01-18 17:16
 */
@Component
public class UserFeignClientFallback implements UserFeignClient {

    @Override
    public Result<String> getUserInfo(String userId) {
        return Result.success("降级的用户信息 - " + userId);
    }

}

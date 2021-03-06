package com.chippy.springcloudalibaba.controller;

import com.chippy.feign.support.api.clients.GenericFeignClient;
import com.chippy.springcloudalibaba.common.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * marketing demo controller
 *
 * @author: chippy
 * @datetime 2021-01-18 17:13
 */
@RestController
@RequestMapping("/marketing/demo")
public class MarketingDemoController {

    @GetMapping("/getPreferential")
    public Result<String> getPreferential(@RequestParam("userId") String userId) {
        return Result
            .success(GenericFeignClient.invokeIfExThrow(String.class, "getUserInfo", userId) + " - preferential info");
    }

}

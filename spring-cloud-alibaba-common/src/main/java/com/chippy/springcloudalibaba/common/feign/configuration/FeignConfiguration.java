package com.chippy.springcloudalibaba.common.feign.configuration;

import com.chippy.springcloudalibaba.common.feign.LoggingFeignClientProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign client configuration
 *
 * @author: chippy
 * @datetime 2021/1/18 22:31
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public LoggingFeignClientProcessor loggingFeignClientProcessor() {
        return new LoggingFeignClientProcessor();
    }

}

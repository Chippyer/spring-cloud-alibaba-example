package com.chippy.springcloudalibaba.common.feign;

import com.chippy.feign.support.api.processor.AbstractLogFeignClientProcessor;

import java.util.LinkedList;
import java.util.List;

/**
 * FeignClient调用日志输出行为处理器
 *
 * @author: chippy
 * @datetime 2020-12-29 19:52
 */
public class LoggingFeignClientProcessor extends AbstractLogFeignClientProcessor {

    @Override
    public List<String> getIncludePathPattern() {
        return new LinkedList<String>() {{
            add("/**");
        }};
    }

    @Override
    public List<String> getExcludePathPattern() {
        return null;
    }

}

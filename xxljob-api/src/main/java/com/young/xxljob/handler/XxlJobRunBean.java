package com.young.xxljob.handler;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @author young
 * @version 1.0
 * @date 2021/4/19 11:08
 * @description xxl 通过bean方式进行任务执行
 */
@Component
public class XxlJobRunBean {

    @XxlJob("XxlJobRunBean")
    public void printParam() {
        System.err.println("xxl job run.");
    }
}

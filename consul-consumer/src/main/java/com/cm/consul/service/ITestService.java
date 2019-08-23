/*
 * Copyright (c) 2016 4PX Information Technology Co.,Ltd. All rights reserved.
 */
package com.cm.consul.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author CaoMian
 * @date 2019年4月24日
 */
@FeignClient("consul-provider")
public interface ITestService {

    /**
     * @return
     */
    @GetMapping("/test/hello")
    String sayHello();

}

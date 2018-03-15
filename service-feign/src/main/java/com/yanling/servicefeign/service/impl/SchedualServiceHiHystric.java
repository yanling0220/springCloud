package com.yanling.servicefeign.service.impl;

import com.yanling.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Feign是自带断路器的，在D版本的Spring Cloud中，它没有默认打开。需要在配置文件中配置打开它
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
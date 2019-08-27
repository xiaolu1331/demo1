package com.example1.demo1.bootlaunch.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerBeanMapperConfigure {

    public DozerBeanMapper mapper(){
        DozerBeanMapper mapper=new DozerBeanMapper();
        return mapper;
    }
}

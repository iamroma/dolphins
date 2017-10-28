package com.roma.dubbo.provider.service;

import com.roma.dubbo.facade.service.DemoService;

/**
 * Created by roma on 2017/10/26
 *
 * @author roma.zheng
 */
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayDemo(String message) {
        return "Hello " + message;
    }
}

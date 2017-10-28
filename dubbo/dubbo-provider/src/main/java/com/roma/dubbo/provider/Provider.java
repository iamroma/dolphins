package com.roma.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by roma on 2017/10/26
 * @author roma.zheng
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"dubbo-provider.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}

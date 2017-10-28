package com.roma.dubbo.consumer;

import com.roma.dubbo.facade.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by roma on 2017/10/26
 * @author roma.zheng
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
        String hello = demoService.sayDemo("Roma"); // execute remote invocation
        System.out.println(hello); // show the result
    }
}

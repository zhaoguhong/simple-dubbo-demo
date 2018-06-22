package com.zhaoguhong.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhaoguhong.dubbo.service.HelloService;

public class Main {
  public static void main(String[] args) throws IOException {
    // 读取配置文件
    ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
    HelloService helloService = (HelloService) context.getBean("consumerHelloService");
    System.out.println(helloService.sysHello("zhaoguhong"));
  }
}

package com.zhaoguhong.main;
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) throws IOException {
    // 读取配置文件
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    context.start();
    System.in.read();
  }


}

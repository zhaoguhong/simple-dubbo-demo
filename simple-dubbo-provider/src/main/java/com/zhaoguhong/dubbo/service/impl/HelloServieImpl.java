package com.zhaoguhong.dubbo.service.impl;

import com.zhaoguhong.dubbo.service.HelloService;

public class HelloServieImpl implements HelloService {

  public String sysHello(String name) {
    return "hello:" + name;
  }

}

package com.demo.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/16
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication8002 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaApplication8002.class,args);
  }
}

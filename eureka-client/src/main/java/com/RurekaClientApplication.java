package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/15
 */
@SpringBootApplication
@EnableEurekaClient
public class RurekaClientApplication {
  public static void main(String[] args) {
    SpringApplication.run(RurekaClientApplication.class,args);
  }
}

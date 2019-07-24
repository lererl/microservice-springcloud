package com.demo.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/17
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication9003 {
  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication9003.class,args);
  }
}

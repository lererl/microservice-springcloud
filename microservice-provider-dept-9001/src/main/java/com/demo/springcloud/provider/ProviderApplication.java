package com.demo.springcloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/5
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.demo.springcloud.provider.mapper","com.demo.springcloud.provider.dao"})
@EnableEurekaClient
public class ProviderApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class,args);
  }
}

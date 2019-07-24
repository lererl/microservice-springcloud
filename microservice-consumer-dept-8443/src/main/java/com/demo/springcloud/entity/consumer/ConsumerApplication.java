package com.demo.springcloud.entity.consumer;

import com.demo.springcloud.entity.consumer.config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/4
 */

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name = "MIRCROSERVICE-PROVIDER-DEPT")
@RibbonClient(name = "MIRCROSERVICE-PROVIDER-DEPT",configuration= MySelfRule.class)
public class ConsumerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class,args);
  }
}

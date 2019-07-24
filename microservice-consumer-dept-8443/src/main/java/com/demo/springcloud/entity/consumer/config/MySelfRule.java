package com.demo.springcloud.entity.consumer.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/23
 */

@Configuration
public class MySelfRule {
  @Bean
  public IRule myRule()
  {
    //return new RandomRule();// Ribbon默认是轮询，我自定义为随机
    //return new RoundRobinRule();// Ribbon默认是轮询，我自定义为随机

    return new RandomRule_ZD();// 我自定义为每台机器5次
  }
}

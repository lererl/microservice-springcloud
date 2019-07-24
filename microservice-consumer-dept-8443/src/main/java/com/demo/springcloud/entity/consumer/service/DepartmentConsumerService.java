package com.demo.springcloud.entity.consumer.service;

import com.demo.springcloud.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/18
 */

@Service
public class DepartmentConsumerService {

  /**
   * 单台调用或者使用ha的ip实现集群调用
   */
  //  private static final String REST_URL_PREFIX = "http://localhost:9001";
  /**
   * 微服务调用（RestTemplate）
   */
  private static final String REST_URL_PREFIX = "http://MIRCROSERVICE-PROVIDER-DEPT";

  @Autowired
  private RestTemplate restTemplate;

  public boolean add(Department department){
    return restTemplate.postForObject(REST_URL_PREFIX + "/department/add",department,Boolean.class);
  }

  public List<Department> list(){
    return restTemplate.getForObject(REST_URL_PREFIX + "/department/list",List.class);
  }

  public Department querry(Long id){
    return restTemplate.getForObject(REST_URL_PREFIX + "/department/querry/" + id,Department.class);
  }

  public Object discovery(){
    return  restTemplate.getForObject(REST_URL_PREFIX + "/department/discovery", DiscoveryClient.class);
  }
}

package com.demo.springcloud.provider.controller;

import com.demo.springcloud.entity.Department;
import com.demo.springcloud.provider.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/9
 */

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @Autowired
  private DiscoveryClient discoveryClient;

  @PostMapping(value = "/add")
  public  boolean add(@RequestBody Department department){
    return departmentService.add(department);
  }

  @GetMapping(value = "/querry/{id}")
  public  Department querryId(@PathVariable Long id){
    return departmentService.get(id);
  }

  @GetMapping(value = "/list")
  public List<Department> list()
  {
    return departmentService.list();
  }

  @RequestMapping(value = "/discovery", method = RequestMethod.GET)
  public Object discovery(){
    List<String> list = discoveryClient.getServices();
    System.out.println("**********" + list);

    List<ServiceInstance> srvList = discoveryClient.getInstances("MIRCROSERVICE-PROVIDER-DEPT");
    srvList.stream()
        .forEach(e->{
          System.out.println(e.getServiceId() + "\t"
              + e.getHost() + "\t"
              + e.getPort() + "\t"
              + e.getUri());
        });

    return this.discoveryClient;
  }
}

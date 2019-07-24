package com.demo.springcloud.entity.consumer.controller;

import com.demo.springcloud.entity.Department;
import com.demo.springcloud.entity.consumer.service.DepartmentConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/12
 */

@RestController
@RequestMapping(value = "/consummer/department")
public class DepartmentConsumerCondtroller {

  @Autowired
  private DepartmentConsumerService service;

  @PostMapping(value = "/add")
  public boolean add(@RequestBody Department department) {
    System.out.println("ccccccccccc:" + department);
    return service.add(department);
  }

  @GetMapping(value = "/list")
  public List<Department> list() {
    return service.list();
  }

  @GetMapping(value = "/querry/{id}")
  public Department querry(@PathVariable Long id) {
    return service.querry(id);
  }

  @GetMapping(value = "/discovery")
  public Object discovery(){
    return service.discovery();
  }

  @PostMapping("/tran")
  public void tran(@RequestParam String body){
    System.out.println(body);
  }
}

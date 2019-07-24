//package com.demo.springcloud.service;
//
//import com.demo.springcloud.entity.Department;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.List;
//
///**
// * (用一句话描述该文件做什么)
// *
// * @author AYL
// * @version 0.0.1
// * @date 2019/7/18
// */
//
////@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
//public interface DepartmentClientService {
//
//  @RequestMapping(value = "/department/get/{id}", method = RequestMethod.GET)
//  Department get(@PathVariable("id") long id);
//
//  @RequestMapping(value = "/department/list", method = RequestMethod.GET)
//  List<Department> list();
//
//  @RequestMapping(value = "/department/add", method = RequestMethod.POST)
//  boolean add(Department dept);
//}
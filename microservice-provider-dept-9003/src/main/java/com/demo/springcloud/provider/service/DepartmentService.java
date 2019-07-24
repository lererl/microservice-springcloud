package com.demo.springcloud.provider.service;

import com.demo.springcloud.entity.Department;

import java.util.List;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/9
 */

public interface DepartmentService {

  boolean add(Department dept);

  Department get(Long id);

  List<Department> list();
}

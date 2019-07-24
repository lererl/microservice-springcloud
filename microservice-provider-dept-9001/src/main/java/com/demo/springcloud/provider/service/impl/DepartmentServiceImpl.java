package com.demo.springcloud.provider.service.impl;

import com.demo.springcloud.entity.Department;
import com.demo.springcloud.provider.mapper.DepartmentMapper;
import com.demo.springcloud.provider.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/9
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  DepartmentMapper departmentMapper;

  @Override
  public boolean add(Department department) {
    return departmentMapper.addDepartment(department);
  }

  @Override
  public Department get(Long id) {
    return departmentMapper.findDepartmentById(id);
  }

  @Override
  public List<Department> list() {
    return departmentMapper.findDepartmentAll();
  }
}

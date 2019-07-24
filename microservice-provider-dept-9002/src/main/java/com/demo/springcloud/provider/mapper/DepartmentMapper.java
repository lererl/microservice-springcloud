package com.demo.springcloud.provider.mapper;

import com.demo.springcloud.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/9
 */

@Mapper
public interface DepartmentMapper {

  boolean addDepartment(Department department);

  Department findDepartmentById(Long id);

  List<Department> findDepartmentAll();
}

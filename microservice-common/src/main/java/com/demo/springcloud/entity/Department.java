package com.demo.springcloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * (用一句话描述该文件做什么)
 *
 * @author AYL
 * @version 0.0.1
 * @date 2019/7/4
 */

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Department implements Serializable {
  /**
   * 主键
   */
  @JsonProperty("dept_num")
  private Long deptNum;
  /**
   * 部门名称
   */
  @JsonProperty("dept_name")
  private String deptName;
  /**
   * 来自那个数据库
   */
  @JsonProperty("db_source")
  private String dbSource;

  /**
   * 插入时间
   */
  @JsonProperty("create_date")
  private Date createDate;
}

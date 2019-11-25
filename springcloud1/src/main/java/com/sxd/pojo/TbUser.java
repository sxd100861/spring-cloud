package com.sxd.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TbUser {

  private Integer id;
  private String username;
  private String password;
  private String name;
  private String sex;
  private Integer age;


  private Date birthday;
  private Integer roleId;


}

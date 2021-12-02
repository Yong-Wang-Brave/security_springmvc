package com.pbteach.security.springmvc.service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 public class AuthenticationRequest {
     /**
      * 用户名
      */
     private String username;

     /**
      * 密码
      */
     private String password;



}
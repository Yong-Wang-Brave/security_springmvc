package com.pbteach.security.springmvc.service;

/**
  * 认证服务
  */
 public interface AuthenticationService {

     /**
      * 用户认证
      * @param authenticationRequest 用户认证请求
      * @return 认证成功的用户信息
      */
     UserDto authentication(AuthenticationRequest authenticationRequest);
 }
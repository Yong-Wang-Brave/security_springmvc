package com.pbteach.security.springmvc.init;

import com.pbteach.security.springmvc.config.ApplicationConfig;
import com.pbteach.security.springmvc.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
     @Override
     protected Class<?>[] getRootConfigClasses() {
         return new Class<?>[] { ApplicationConfig.class };//指定rootContext的配置类
    }

     @Override
     protected Class<?>[] getServletConfigClasses() {
         return new Class<?>[] { WebConfig.class }; //指定servletContext的配置类
    }

     @Override
     protected String[] getServletMappings() {
         return new String [] {"/"};
    }
 }
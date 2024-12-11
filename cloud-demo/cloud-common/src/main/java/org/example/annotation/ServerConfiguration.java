package org.example.annotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @Description: 启动类注解统一封装
 * @Param: 
 * @Return: 
 * @Author: yeyc
 * @Date: 2024/12/11
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@EnableDiscoveryClient
@MapperScan("org.example.mapper")
@EnableFeignClients
public @interface ServerConfiguration {
}

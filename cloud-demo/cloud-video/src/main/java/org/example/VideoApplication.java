package org.example;

import org.example.annotation.ServerConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author yeyc
 * @Description 描述类的作用
 * @Date 2024/12/10
 * @Param
 * @Exception
 **/
@SpringBootApplication
@ServerConfiguration
public class VideoApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class, args);
    }
}

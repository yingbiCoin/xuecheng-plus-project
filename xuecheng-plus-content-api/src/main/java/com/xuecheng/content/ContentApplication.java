package com.xuecheng.content;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 23671
 * @version 1.0
 * @description api接口启动类
 * @date 2023/1/27 17:09
 */
@EnableSwagger2Doc
@SpringBootApplication
@ComponentScan(basePackages = {"com.xuecheng.base", "com.xuecheng.content"})
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}

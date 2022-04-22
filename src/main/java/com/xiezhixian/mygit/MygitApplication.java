package com.xiezhixian.mygit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xiezhixian.mygit.mapper"})
public class MygitApplication {

    public static void main(String[] args) {
        System.out.println("xzxzxzx");
        SpringApplication.run(MygitApplication.class, args);
    }

}

package com.tkc.mymall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.tkc.mymall.user.mapper")
public class MymallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallUserApplication.class, args);
    }

}

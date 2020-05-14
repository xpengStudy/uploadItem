package com.xp.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.xp.goods.mapper")
@EnableCaching
public class GoodsApplication8888 {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication8888.class,args);
    }
}

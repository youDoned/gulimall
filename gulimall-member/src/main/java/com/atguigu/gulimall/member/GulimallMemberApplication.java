package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 需要调用别的服务 比如调用coupon查询优惠卷
 * 1）引入 openfeign （远程接口调用
 * 2）编写一个接口，告诉springcloud这个接口需要调用远程服务
 */

@EnableDiscoveryClient  //注册发现服务
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}

package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 需要调用别的服务 比如调用coupon查询优惠卷
 * 1）引入 openfeign （远程接口调用
 * 2）编写一个接口，告诉springcloud这个接口需要调用哪个远程服务的哪儿哪个mapping
 * 3）开启远程调用功能 （下面 自动扫描这个包下的 rpc接口
 */
@EnableFeignClients(basePackages= "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient  //注册发现服务
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}

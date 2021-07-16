package com.atguigu.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.引入依赖：
 * <dependency>
 *     <groupId>com.alibaba.cloud</groupId>
 *     <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 * </dependency>
 * 2.创建一个bootstrap.properties 放入配置中心地址(bootstrap的优先级高于yml或者properties
 * spring.application.name=gulimall-coupon
 * spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3.需要给配置中心添加配置集（dataId）gulimall-coupon.properties 默认规则应用名.properties
 * 给gulimall-coupon.properties添加配置
 * 4.动态刷新属性更改配置  controller上面写@RefreshScope 动态获取并且刷新配置
 * 配置中心有的  优先使用配置中心
 *
 * 细节：
 * 1.命名空间：配置隔离 默认public 默认新增的配置都在public空间
 *  开发 测试 生产 利用命名空间来做环境隔离  并且在bootstrap.properties配置使用哪个空间的id
 *  spring.cloud.nacos.config.namespace=df3f7a39-73eb-4a67-831f-bdb718ea26d9
 *  每个微服务之间相互隔离 每个微服务都创建自己的命名空间，且加载自己的命名空间的所有配置
 * 2.配置集： 所有的配置的集合
 * 3.配置集id: 类似配置文件名 data id
 * 4.配置分组：默认所有的配置集都属于DEFAULT_GROUP
 * 区分环境  比如双十一  或者双十二 等等
 *
 *3.同时加载多个配置集dataid
 * 微服务任何配置信息 任何配置文件都可以放在配置中心
 * 只需要在bootstrap.properties说明加载配置中心哪些配置文件即可
 * 配置中心有的优先使用配置中心的
 */

@EnableDiscoveryClient   //开启服务注册发现功能
@MapperScan("com.atguigu.gulimall.coupon.dao")
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}

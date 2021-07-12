package com.atguigu.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 告诉spring 这个一个远程服务 调用远程客户端 gulimall-coupon 调用哪个写哪个
 */
@FeignClient("gulimall-coupon")
public interface CouponFeiService {
}

package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 告诉spring 这个一个远程服务 调用远程客户端 gulimall-coupon 调用哪个写哪个
 */
@FeignClient("gulimall-coupon")
public interface CouponFeiService {


    /**
     * 完整路径+方法
     * feign去服务注册中心找 gulimall-coupon 里面的 /coupon/coupon/member/list
     * 大概就是这个意思吧
     */

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}





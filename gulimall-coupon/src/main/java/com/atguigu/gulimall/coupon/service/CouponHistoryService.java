package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 15:04:28
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


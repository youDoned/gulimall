package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 15:04:17
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


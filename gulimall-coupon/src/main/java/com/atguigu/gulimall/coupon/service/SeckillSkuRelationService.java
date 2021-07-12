package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 15:04:15
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


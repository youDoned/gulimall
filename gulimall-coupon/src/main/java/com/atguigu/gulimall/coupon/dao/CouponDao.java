package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 15:04:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

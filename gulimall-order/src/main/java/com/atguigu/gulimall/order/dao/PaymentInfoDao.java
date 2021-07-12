package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 19:39:29
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}

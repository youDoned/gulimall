package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 19:39:35
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

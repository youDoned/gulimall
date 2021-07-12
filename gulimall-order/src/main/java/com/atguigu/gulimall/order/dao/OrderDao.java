package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 19:39:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 19:39:35
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}

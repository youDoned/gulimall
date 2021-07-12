package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 19:39:31
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}

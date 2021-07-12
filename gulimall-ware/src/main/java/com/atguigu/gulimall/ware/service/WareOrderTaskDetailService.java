package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 19:54:57
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


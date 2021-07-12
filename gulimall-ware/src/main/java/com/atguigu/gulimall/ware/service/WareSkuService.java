package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 19:54:56
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


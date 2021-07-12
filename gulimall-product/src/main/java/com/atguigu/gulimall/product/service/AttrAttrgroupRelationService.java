package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-10 23:59:55
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


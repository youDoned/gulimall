package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-10 23:59:54
 */

public interface BrandService extends IService<BrandEntity> {


    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}


package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-10 23:59:51
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


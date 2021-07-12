package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 18:46:51
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


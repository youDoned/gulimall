package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author feifei
 * @email 2205968704@qq.com
 * @date 2021-07-11 18:46:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

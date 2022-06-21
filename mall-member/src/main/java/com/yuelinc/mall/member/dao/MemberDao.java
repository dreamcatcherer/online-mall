package com.yuelinc.mall.member.dao;

import com.yuelinc.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author QiushiCui
 * @email yuelincui101@gmail.com
 * @date 2022-06-19 20:24:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

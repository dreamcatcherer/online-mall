package com.yuelinc.mall.product.dao;

import com.yuelinc.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author Qiushi Cui
 * @email yuelincui101@gmail.com
 * @date 2022-06-21 13:05:49
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}

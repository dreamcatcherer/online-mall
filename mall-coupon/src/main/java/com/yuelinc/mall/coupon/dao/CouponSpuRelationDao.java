package com.yuelinc.mall.coupon.dao;

import com.yuelinc.mall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author QiushiCui
 * @email yuelincui101@gmail.com
 * @date 2022-06-19 20:12:35
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}

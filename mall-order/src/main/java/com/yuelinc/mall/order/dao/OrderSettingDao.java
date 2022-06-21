package com.yuelinc.mall.order.dao;

import com.yuelinc.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author QiushiCui
 * @email yuelincui101@gmail.com
 * @date 2022-06-19 20:32:29
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}

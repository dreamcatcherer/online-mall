package com.yuelinc.mall.order.dao;

import com.yuelinc.mall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author QiushiCui
 * @email yuelincui101@gmail.com
 * @date 2022-06-19 20:32:29
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}

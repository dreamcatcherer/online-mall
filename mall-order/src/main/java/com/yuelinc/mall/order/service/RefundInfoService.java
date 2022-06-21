package com.yuelinc.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelinc.common.utils.PageUtils;
import com.yuelinc.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author QiushiCui
 * @email yuelincui101@gmail.com
 * @date 2022-06-19 20:32:29
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


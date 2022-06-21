package com.yuelinc.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelinc.common.utils.PageUtils;
import com.yuelinc.mall.coupon.entity.SkuBoundsEntity;

import java.util.Map;

/**
 * 商品sku积分设置
 *
 * @author QiushiCui
 * @email yuelincui101@gmail.com
 * @date 2022-06-19 20:12:35
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


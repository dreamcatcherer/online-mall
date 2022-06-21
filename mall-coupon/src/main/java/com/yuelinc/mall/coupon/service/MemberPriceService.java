package com.yuelinc.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelinc.common.utils.PageUtils;
import com.yuelinc.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author QiushiCui
 * @email yuelincui101@gmail.com
 * @date 2022-06-19 20:12:35
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


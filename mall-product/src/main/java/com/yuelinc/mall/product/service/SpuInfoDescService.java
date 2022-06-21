package com.yuelinc.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelinc.common.utils.PageUtils;
import com.yuelinc.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Qiushi Cui
 * @email yuelincui101@gmail.com
 * @date 2022-06-21 13:05:49
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


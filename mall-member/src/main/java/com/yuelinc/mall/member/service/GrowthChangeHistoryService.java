package com.yuelinc.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuelinc.common.utils.PageUtils;
import com.yuelinc.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author QiushiCui
 * @email yuelincui101@gmail.com
 * @date 2022-06-19 20:24:29
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


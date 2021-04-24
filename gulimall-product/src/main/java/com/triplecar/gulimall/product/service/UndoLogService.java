package com.triplecar.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.triplecar.common.utils.PageUtils;
import com.triplecar.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author triplecar
 * @email 767578538@qq.com
 * @date 2021-04-18 19:55:04
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


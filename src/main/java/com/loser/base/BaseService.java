package com.loser.base;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.hibernate.loader.entity.plan.AbstractLoadPlanBasedEntityLoader;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 通用服务层
 *
 * @author Jason
 * @version createTime 2020/6/11 23:31
 */
public class BaseService<T extends BasedEntity> {

    @Autowired
    BaseMapper<T> mapper;

}

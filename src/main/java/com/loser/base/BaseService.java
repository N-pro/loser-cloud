package com.loser.base;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.databind.ser.Serializers;
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
public class BaseService<T> implements BaseMapper {

    @Autowired
    BaseMapper<T> mapper;


    @Override
    public int insert(Object entity) {
        return 0;
    }

    @Override
    public int deleteById(Serializable id) {
        return 0;
    }

    @Override
    public int delete(Wrapper wrapper) {
        return 0;
    }

    @Override
    public int updateById(Object entity) {
        return 0;
    }

    @Override
    public int update(Object entity, Wrapper updateWrapper) {
        return 0;
    }

    @Override
    public Object selectById(Serializable id) {
        return null;
    }

    @Override
    public Object selectOne(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public Integer selectCount(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public List selectList(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> selectMapsPage(IPage page, Wrapper queryWrapper) {
        return null;
    }

    @Override
    public IPage selectPage(IPage page, Wrapper queryWrapper) {
        return null;
    }

    @Override
    public List selectByMap(Map columnMap) {
        return null;
    }

    @Override
    public List selectBatchIds(Collection idList) {
        return null;
    }

    @Override
    public int deleteBatchIds(Collection idList) {
        return 0;
    }

    @Override
    public int deleteByMap(Map columnMap) {
        return 0;
    }
}

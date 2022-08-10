package com.sss.ormbase.autogenerator.common.service.impl;

import com.sss.ormbase.autogenerator.common.mapper.BaseMapper;
import com.sss.ormbase.autogenerator.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("ALL")
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
    @Autowired
    protected BaseMapper<T, ID> baseMapper;


    @Override
    public int deleteByPrimaryKey(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T record) {
        return baseMapper.insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return baseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return baseMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<T> selectList(T record, int limit, int offset) {
        return baseMapper.selectList(record, limit, offset);
    }

    @Override
    public List<T> selectList(T record) {
        return baseMapper.selectList(record,0,0);
    }
    @Override
    public int getCount(T record){
        return baseMapper.getCount(record);
    }

}

package com.sss.ormbase.autogenerator.common.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T, ID extends Serializable> {

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(ID id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> selectList(T entity);

    List<T> selectList(T entity, int limit, int offset);
    int getCount(T entity);
}

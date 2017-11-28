package com.chris.mybais.mapper;

import com.chris.mybais.po.AutoIncrementEntity;

import org.springframework.stereotype.Repository;

/**
 * Created by Chris on 2017/11/28.
 */
@Repository
public interface AutoIncrementMapper {
    void insertData(AutoIncrementEntity autoIncrementEntity) throws Exception;
}

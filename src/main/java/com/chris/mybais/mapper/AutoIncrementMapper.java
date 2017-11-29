package com.chris.mybais.mapper;

import com.chris.mybais.po.AutoIncrementEntity;

import org.springframework.stereotype.Repository;

/**
 * Created by Chris on 2017/11/28.
 */
@Repository
public interface AutoIncrementMapper {
    int insertData(AutoIncrementEntity autoIncrementEntity) throws Exception;
    AutoIncrementEntity selectData(Long id) throws Exception;
    int deleteData(Long id) throws Exception;
    int updateData(AutoIncrementEntity autoIncrementEntity) throws Exception;
}

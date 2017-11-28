package com.chris.mybais.service.impl;

import com.chris.mybais.mapper.AutoIncrementMapper;
import com.chris.mybais.po.AutoIncrementEntity;
import com.chris.mybais.service.AutoIncrementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Chris on 2017/11/28.
 */
@Service
public class AutoIncrementServiceImpl implements AutoIncrementService{

    @Autowired
    private AutoIncrementMapper mAutoIncrementEntityMapper;

    @Override
    public String insertData(AutoIncrementEntity autoIncrementEntity) throws Exception {
        mAutoIncrementEntityMapper.insertData(autoIncrementEntity);
        return "ok,lalala";
    }

    @Override
    public AutoIncrementEntity selectData(Long id) throws Exception {
        return mAutoIncrementEntityMapper.selectData(id);
    }

    @Override
    public String deleteData(Long id) throws Exception {
        mAutoIncrementEntityMapper.deleteData(id);
        return "deleteSuccess";
    }

    @Override
    public String updateData(AutoIncrementEntity autoIncrementEntity) throws Exception {
        mAutoIncrementEntityMapper.updateData(autoIncrementEntity);
        return "updateSuccess";
    }
}

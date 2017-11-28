package com.chris.mybais.service;

import com.chris.mybais.po.AutoIncrementEntity;

/**
 * Created by Chris on 2017/11/28.
 */

public interface AutoIncrementService {
    String insertData(AutoIncrementEntity autoIncrementEntity) throws Exception;

    AutoIncrementEntity selectData(Long id) throws Exception;

    String deleteData(Long id) throws Exception;


}

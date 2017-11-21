package com.chris.mybais.service.impl;

import com.chris.mybais.mapper.ItemsMapperCustom;
import com.chris.mybais.po.ItemsCustom;
import com.chris.mybais.po.ItemsQueryVo;
import com.chris.mybais.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Chris on 2017/11/21.
 */

public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
}
package com.chris.mybais.service.impl;

import com.chris.mybais.mapper.ItemsMapper;
import com.chris.mybais.po.ItemsCustom;
import com.chris.mybais.po.ItemsQueryVo;
import com.chris.mybais.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chris on 2017/11/21.
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapperCustom;

    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }

    @Override
    public ItemsCustom loadPerson(Long id) throws Exception {
        return itemsMapperCustom.loadPerson(id);
    }

    @Override
    public int selectPerson(ItemsCustom itemsCustom) throws Exception {

        return itemsMapperCustom.selectPerson(itemsCustom);
    }
}
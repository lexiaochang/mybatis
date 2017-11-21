package com.chris.mybais.mapper;

import com.chris.mybais.po.ItemsCustom;
import com.chris.mybais.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by Chris on 2017/11/21.
 */

public interface ItemsMapperCustom {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
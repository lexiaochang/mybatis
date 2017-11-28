package com.chris.mybais.mapper;

import com.chris.mybais.po.ItemsCustom;
import com.chris.mybais.po.ItemsQueryVo;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Chris on 2017/11/21.
 */
@Repository
public interface ItemsMapper {

    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

//        @Insert(" insert into user (id, name, descrip) values ('3', 'name123', 'des123')")
    ItemsCustom loadPerson(Long id) throws Exception;

//    @Select("SELECT * FROM user WHERE ID = #{id}")
    void selectPerson(ItemsCustom itemsCustom) throws Exception;
}
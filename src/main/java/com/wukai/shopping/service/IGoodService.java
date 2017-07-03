package com.wukai.shopping.service;

import com.wukai.shopping.model.TGood;

import java.util.List;

/**
 * Created by 锴 on 2017/6/8.
 */
public interface IGoodService {
    int deleteByPrimaryKey(Integer id);

    int insert(TGood record);

    int insertSelective(TGood record);

    TGood selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGood record);

    int updateByPrimaryKey(TGood record);

    List<TGood> selectAll();

    List<TGood> selectByName(String name);//undefine
}

package com.wukai.shopping.dao;

import com.wukai.shopping.model.TGood;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface TGoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TGood record);

    int insertSelective(TGood record);

    TGood selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGood record);

    int updateByPrimaryKey(TGood record);

    List<TGood> selectAll();
}
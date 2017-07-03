package com.wukai.shopping.dao;

import com.wukai.shopping.model.TOrder;
import com.wukai.shopping.model.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface TOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TOrder record);


    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);

    List<TOrder> selectAll();

    List<TOrder> selectOrder();

    List<TOrder> selectByUserIdC(Integer id);

    List<TOrder> selectOrderByUser(Integer id);
}
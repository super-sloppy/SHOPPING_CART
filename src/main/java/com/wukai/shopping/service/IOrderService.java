package com.wukai.shopping.service;

import com.wukai.shopping.model.TOrder;
import com.wukai.shopping.model.TUser;

import java.util.List;

/**
 * Created by 锴 on 2017/6/10.
 */
public interface IOrderService {
    List<TOrder> selectAll();

    List<TOrder> selectOrder();

    int deleteByPrimaryKey(Integer id);

    int insertSelective(TOrder record);

    List<TOrder> selectByUserIdC(Integer id);

    TOrder selectByPrimaryKey(Integer id);

    Double updateByPrimaryKeySelective(TOrder record,Integer n);

    int updateByPrimaryKey(TOrder record);

    List<TOrder> selectOrderByUser(Integer id);
}

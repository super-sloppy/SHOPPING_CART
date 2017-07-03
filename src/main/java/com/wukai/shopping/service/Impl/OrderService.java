package com.wukai.shopping.service.Impl;

import com.wukai.shopping.dao.TGoodMapper;
import com.wukai.shopping.dao.TOrderMapper;
import com.wukai.shopping.dao.TUserMapper;
import com.wukai.shopping.model.TGood;
import com.wukai.shopping.model.TOrder;
import com.wukai.shopping.model.TUser;
import com.wukai.shopping.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 锴 on 2017/6/10.
 */
@Service
public class OrderService implements IOrderService {
    @Resource
    private TOrderMapper orderMapper;
    @Resource
    private TGoodMapper goodMapper;
    public List<TOrder> selectAll() {
        return orderMapper.selectAll();
    }

    public List<TOrder> selectOrder() {
        return orderMapper.selectOrder();
    }

    public int deleteByPrimaryKey(Integer id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    public int insertSelective(TOrder record) {
        return orderMapper.insertSelective(record);
    }

    public List<TOrder> selectByUserIdC(Integer id) {
        return orderMapper.selectByUserIdC(id);
    }

    public TOrder selectByPrimaryKey(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    public Double updateByPrimaryKeySelective(TOrder record , Integer n) {
        int goodId=record.getGoodId();
        System.out.println("goodId-->"+goodId);


        Double totalPrice,price;
        TGood good=goodMapper.selectByPrimaryKey(goodId);
        price=good.getGoodPrice();

        System.out.println("price-->"+price);

        totalPrice=price*n;

        System.out.println("totalprice-->"+totalPrice);
        record.setGoodNum(n);
        record.setTotalPrice(totalPrice);
        int i=1;
        record.setOrderStatu(i);
        orderMapper.updateByPrimaryKey(record);
        return totalPrice;
    }

    public int updateByPrimaryKey(TOrder record) {
        return orderMapper.updateByPrimaryKey(record);
    }

    public List<TOrder> selectOrderByUser(Integer id) {
        return orderMapper.selectOrderByUser(id);
    }

}

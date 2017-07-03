package com.wukai.shopping.service.Impl;

import com.wukai.shopping.dao.TGoodMapper;
import com.wukai.shopping.model.TGood;
import com.wukai.shopping.service.IGoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 锴 on 2017/6/8.
 */
@Service
public class GoodService implements IGoodService {

    @Resource
    private TGoodMapper goodMapper;

    public int deleteByPrimaryKey(Integer id) {
        return goodMapper.deleteByPrimaryKey(id);
    }

    public int insert(TGood record) {
        return 0;
    }

    public int insertSelective(TGood record) {
        return goodMapper.insertSelective(record);
    }

    public TGood selectByPrimaryKey(Integer id) {
        return goodMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(TGood record) {
        return 0;
    }

    public int updateByPrimaryKey(TGood record) {
        return 0;
    }

    public List<TGood> selectAll() {
        return goodMapper.selectAll();
    }

    public List<TGood> selectByName(String name) {
        return null;
    }
}

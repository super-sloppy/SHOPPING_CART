package com.wukai.shopping.service;

import com.wukai.shopping.model.TGood;
import com.wukai.shopping.model.TOrder;
import com.wukai.shopping.model.TUser;

import java.util.List;

/**
 * Created by 锴 on 2017/6/6.
 */
public interface IUserService {
    int insertUser(TUser record);
    int insertSelective(TUser record);
    TUser selectByUsername(TUser user);
    TUser selectByPrimaryKey(Integer id);
    TUser checkReset(TUser record);
    int updatePwd(TUser record);
    List<TUser> selectAll();
    int deleteByPrimaryKey(Integer id);
}

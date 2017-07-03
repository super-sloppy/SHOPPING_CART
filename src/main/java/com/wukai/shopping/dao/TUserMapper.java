package com.wukai.shopping.dao;

import com.wukai.shopping.model.TGood;
import com.wukai.shopping.model.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    int updatePwd(TUser record);

    TUser selectByUsername(TUser user);

    TUser checkReset(TUser record);

    List<TUser> selectAll();
}
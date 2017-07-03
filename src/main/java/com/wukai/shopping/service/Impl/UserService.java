package com.wukai.shopping.service.Impl;



import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.wukai.shopping.dao.TUserMapper;
import com.wukai.shopping.model.TUser;
import com.wukai.shopping.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * Created by 锴 on 2017/6/6.
 */
@Service
public class UserService implements IUserService{

    @Resource
    private TUserMapper userMapper;

    public int insertUser(TUser record) {
        return userMapper.insert(record);
    }

    public int insertSelective(TUser record){
        return userMapper.insertSelective(record);
    }

    public TUser selectByUsername(TUser user) {
        return userMapper.selectByUsername(user);
    }


    public TUser selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public TUser checkReset(TUser record) {
        return userMapper.checkReset(record);
    }

    public int updatePwd(TUser record) {
        return userMapper.updatePwd(record);
    }

    public List<TUser> selectAll() {
        return userMapper.selectAll();
    }

    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}

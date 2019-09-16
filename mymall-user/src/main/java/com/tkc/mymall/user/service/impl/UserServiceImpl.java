package com.tkc.mymall.user.service.impl;

import com.tkc.mymall.user.mapper.UserMapper;
import com.tkc.mymall.user.model.UmsMember;
import com.tkc.mymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author tiankechuan
 * @Date 2019-09-16 15:37
 * @Description TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUsr() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMember> getById(String id) {
        Example example = new Example(UmsMember.class);
        example.createCriteria().andEqualTo("id",id);
        return userMapper.selectByExample(example);
    }
}

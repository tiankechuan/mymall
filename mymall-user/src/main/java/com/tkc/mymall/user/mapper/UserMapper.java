package com.tkc.mymall.user.mapper;

import com.tkc.mymall.user.model.UmsMember;

import java.util.List;

public interface UserMapper {
    List<UmsMember> selectAllUser();
}

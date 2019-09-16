package com.tkc.mymall.user.service;

import com.tkc.mymall.user.model.UmsMember;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUsr();
    List<UmsMember> getById(String id);
}

package com.tkc.mymall.user.controller;

import com.tkc.mymall.user.model.UmsMember;
import com.tkc.mymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author tiankechuan
 * @Date 2019-09-16 15:36
 * @Description TODO
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("index")
    public String index() {
        return "Hello user!!";
    }

    @GetMapping("getAllUsr")
    public List<UmsMember> getAllUsr() {
        return userService.getAllUsr();
    }
}

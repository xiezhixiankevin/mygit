package com.xiezhixian.mygit.service;

import com.xiezhixian.mygit.pojo.User;

import java.util.List;

/**
 * <Description> UserService
 *
 * @author 26802
 * @version 1.0
 * @ClassName UserService
 * @taskId
 * @see com.xiezhixian.mygit.service
 */
public interface UserService {

    //注册用户
    boolean registerUser(String username,String password);
    //用户登录
    User login(String username, String password);
    //获取用户列表
    List<User> listUserWithOutProject(Integer id);
}

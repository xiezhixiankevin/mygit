package com.xiezhixian.mygit.service.Impl;

import com.xiezhixian.mygit.mapper.PUserMapper;
import com.xiezhixian.mygit.mapper.UserMapper;
import com.xiezhixian.mygit.pojo.PUser;
import com.xiezhixian.mygit.pojo.PUserExample;
import com.xiezhixian.mygit.pojo.User;
import com.xiezhixian.mygit.pojo.UserExample;
import com.xiezhixian.mygit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * <Description> UserServiceImpl
 *
 * @author 26802
 * @version 1.0
 * @ClassName UserServiceImpl
 * @taskId
 * @see com.xiezhixian.mygit.service.Impl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PUserMapper pUserMapper;

    @Override
    public boolean registerUser(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        if (userMapper.selectByExample(userExample).isEmpty()){
            userMapper.insertSelective(new User(username,password,false));
            return true;
        }
        return false;
    }

    @Override
    public User login(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> userList = userMapper.selectByExample(userExample);
        if (!userList.isEmpty()){
            User user = userList.get(0);
            return user;
        }
        return null;
    }

    @Override
    public List<User> listUserWithOutProject(Integer id) {
        List<User> userList = userMapper.selectByExample(null);
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            PUserExample pUserExample = new PUserExample();
            pUserExample.createCriteria().andUserIdEqualTo(user.getId()).andProjectIdEqualTo(id);
            List<PUser> pUsers = pUserMapper.selectByExample(pUserExample);
            if (!pUsers.isEmpty()){
                iterator.remove();
            }
        }

        return userList;
    }
}

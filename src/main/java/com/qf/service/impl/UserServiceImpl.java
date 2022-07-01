package com.qf.service.impl;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserMapper userMapper;

    //添加用户
    public int addUser(User user){return userMapper.addUser(user);}

    //删除用户
    public int deleteUser(int id){return userMapper.deleteUser(id);}

    //修改用户
    public int updateUser(User user){return userMapper.updateUser(user);}

    //模糊查询用户
    public List<User> selectUserByName(String name){return userMapper.selectUserByName(name);};

    //全部查询
    public List<User> selectAll(){
        return  userMapper.selectAll();
    }
}

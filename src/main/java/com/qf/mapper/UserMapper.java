package com.qf.mapper;
import com.qf.pojo.User;

import java.util.List;

public interface UserMapper {

    //添加用户
    public int addUser(User user);

    //删除用户
    public int deleteUser(int id);

    //修改用户
    public int updateUser(User user);

    //模糊查询用户
    public List<User> selectUserByName(String name);

    //全部查询
    public List<User> selectAll();

}

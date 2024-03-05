package com.gu.rpc.provider;

import com.gu.rpc.common.model.User;
import com.gu.rpc.common.service.UserService;

public class UserServiceImpl implements UserService {
    public User getUser(User user){
        System.out.println("Name:" + user.getName());
        return user;
    }
}

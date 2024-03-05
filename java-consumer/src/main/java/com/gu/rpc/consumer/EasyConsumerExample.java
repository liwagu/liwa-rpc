package com.gu.rpc.consumer;

import com.gu.rpc.common.model.User;
import com.gu.rpc.common.service.UserService;
import com.gu.rpc.proxy.ServiceProxyFactory;

public class EasyConsumerExample {
    public static void main(String[] args) {
/*        // todo 需要获取 UserSerice 的实现对象
        UserService userService = null;
        User user = new User();
        user.setName("yupi");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }*/

        /*
        // 静态代理
        UserServiceProxy userServiceProxy = new UserServiceProxy();*/

        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
    }
}

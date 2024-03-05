package com.gu.rpc.provider;

import com.gu.rpc.common.service.UserService;
import com.gu.rpc.registry.LocalRegistry;
import com.gu.rpc.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
        //注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        // 启动web服务
        VertxHttpServer vertxHttpServer = new VertxHttpServer();
        vertxHttpServer.doStartServer(8080);
    }
}

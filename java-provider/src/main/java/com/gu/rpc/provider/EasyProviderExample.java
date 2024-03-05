package com.gu.rpc.provider;

import com.gu.rpc.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
        // 启动web服务
        VertxHttpServer vertxHttpServer = new VertxHttpServer();
        vertxHttpServer.doStartServer(8080);
    }
}

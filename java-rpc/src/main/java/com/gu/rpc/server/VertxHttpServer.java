package com.gu.rpc.server;

import io.vertx.core.Vertx;
/**
 * @description Vertx HTTP 服务器
 * @author liwa
 * @date 2024-03-05 19:29
 */

public class VertxHttpServer implements HttpServer {
    @Override
    public void doStartServer(int port) {
        Vertx vertx = Vertx.vertx();//创建Vertx.x实例

        //创建HTTP服务器
        io.vertx.core.http.HttpServer httpServer = vertx.createHttpServer();
        //监听端口并处理请求
        httpServer.requestHandler(new HttpServerHandler()); // 用HttpServerHandler 代替了原来的手动处理
       /* httpServer.requestHandler(request -> {
            // 处理http请求
            System.out.println("Received request: " + request.method() + " " + request.uri());

            // 发送http响应
            request.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x HTTP server");
        });*/

        // 启动 HTTP 服务并监听指定端口
        httpServer.listen(port, httpServerAsyncResult -> {
            if (httpServerAsyncResult.succeeded()) {
                System.out.println("Server is mow listening on port" + port);
            } else {
                System.err.println("Failed to start server: " + httpServerAsyncResult.cause());
            }
        });

    }
}

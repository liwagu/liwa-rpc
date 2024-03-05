package com.gu.rpc.consumer;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.gu.rpc.common.model.User;
import com.gu.rpc.common.service.UserService;
import com.gu.rpc.model.RpcRequest;
import com.gu.rpc.model.RpcResponse;
import com.gu.rpc.serializer.JdkSerializer;
import com.gu.rpc.serializer.Serializer;

import java.io.IOException;

public class UserServiceProxy implements UserService {
    public User getUser(User user) {
        Serializer serializer = new JdkSerializer();
        RpcRequest request = RpcRequest.builder()
                .serviceName(UserService.class.getName())
                .methodName("getUser")
                .parameterTypes(new Class[]{User.class})
                .build();
        try {
            byte[] bodyBytes = serializer.serialize(request);
            byte[] result;
            try (HttpResponse httpResponse = HttpRequest.post("http://localhost:8080")
                    .body(bodyBytes)
                    .execute()) {
                result = httpResponse.bodyBytes();
            }
            RpcResponse rpcResponse = serializer.deserialize(result, RpcResponse.class);
            return (User) rpcResponse.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

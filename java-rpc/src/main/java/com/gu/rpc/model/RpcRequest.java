package com.gu.rpc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description 请求类：作用是封装调用所需的信息，比如服务名称、方法名称、调用参数的类型列表、参数列表。这些都是 Java 反射机制所需的参数。
 * @author liwa
 * @date 2024-03-05 18:48
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcRequest {
    // 服务名称
    private String serviceName;

    //方法名称
    private String methodName;

    //参数类型列表
    private Class<?>[] parameterTypes;

    //参数列表
    private Object[] args;
}

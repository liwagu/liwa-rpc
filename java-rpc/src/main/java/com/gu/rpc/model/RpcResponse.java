package com.gu.rpc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liwa
 * @description RPC响应类
 * @date 2024-03-05 18:52
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcResponse {
    // 响应数据
    private Object data;

    // 响应数据类型
    private Class<?> dataType;

    // 响应信息
    private String message;

    // 异常信息
    private Exception exception;
}

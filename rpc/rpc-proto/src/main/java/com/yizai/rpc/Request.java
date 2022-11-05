package com.yizai.rpc;

import lombok.Data;

/**
 * 表示 RPC 的一个请求
 *
 * @author yizai
 */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}

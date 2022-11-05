package com.yizai.rpc;

import lombok.Data;

/**
 * 表示 RPC 的响应
 *
 * @author yizai
 */
@Data
public class Response {
    /**
     * 服务返回的编码，0 成功，非 0 失败
     */
    private int code = 0;
    /**
     * 具体的错误信息
     */
    private String message = "ok";
    /**
     * 响应数据
     */
    private Object data;
}

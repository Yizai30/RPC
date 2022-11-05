package com.yizai.rpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的 handler
 *
 * @author yizai
 * @since 2022/10/20 23:05
 */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}

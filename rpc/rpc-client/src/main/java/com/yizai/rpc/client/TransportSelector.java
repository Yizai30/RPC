package com.yizai.rpc.client;

import com.yizai.rpc.Peer;
import com.yizai.rpc.transport.TransportClient;

import java.util.List;

/**
 * 表示选择哪个 server 去连接
 *
 * @author yizai
 * @since 2022/10/22 18:43
 */
public interface TransportSelector {
    /**
     * 初始化 selector
     *
     * @param peers 可以连接的 server 端点信息
     * @param count client 与 server 建立多少个连接
     * @param clazz client 实现 class
     */
    void init(List<Peer> peers, int count,
              Class<? extends TransportClient> clazz);

    /**
     * 选择一个 transport 与 server 做交互
     *
     * @return 网络 client
     */
    TransportClient select();

    /**
     * 释放用完的 client
     *
     * @param client 网络 client
     */
    void release(TransportClient client);

    void close();
}

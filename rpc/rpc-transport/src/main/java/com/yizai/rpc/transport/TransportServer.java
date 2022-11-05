package com.yizai.rpc.transport;

/**
 * 1、启动，监听端口
 * 2、接受请求
 * 3、关闭监听
 * @author yizai
 * @since 2022/10/20 23:03
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);

    void start();

    void stop();
}

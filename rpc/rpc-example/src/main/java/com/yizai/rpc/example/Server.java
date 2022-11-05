package com.yizai.rpc.example;

import com.yizai.rpc.server.RpcServer;

/**
 * @author yizai
 * @since 2022/10/22 20:05
 */
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer();
        server.register(CalcService.class, new CalcServiceImpl());
        server.start();
    }
}

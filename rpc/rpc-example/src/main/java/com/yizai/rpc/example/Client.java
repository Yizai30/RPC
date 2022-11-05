package com.yizai.rpc.example;

import com.yizai.rpc.client.RpcClient;

/**
 * @author yizai
 * @since 2022/10/22 20:05
 */
public class Client {
    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);

        int r1 = service.add(1, 2);
        int r2 = service.minus(30, 22);

        System.out.println(r1);
        System.out.println(r2);
    }
}

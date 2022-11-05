package com.yizai.rpc.example;

/**
 * @author yizai
 * @since 2022/10/22 20:06
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}

package com.yizai.rpc.codec;

/**
 * 序列化
 *
 * @author yizai
 * @since 2022/10/20 18:34
 */
public interface Encoder {
    /**
     * 将对象转化为二进制编码
     * @param obj 待序列化的对象
     * @return 二进制编码
     */
    byte[] encode(Object obj);
}

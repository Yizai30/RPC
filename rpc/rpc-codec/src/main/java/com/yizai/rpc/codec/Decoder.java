package com.yizai.rpc.codec;

/**
 * 反序列化
 *
 * @author yizai
 * @since 2022/10/20 18:37
 */
public interface Decoder {
    /**
     * 将二进制编码反序列化为对象
     * @param bytes 二进制编码
     * @param clazz 相应类的对象
     * @param <T> 泛型以省去强制转换类型
     * @return 相应对象
     */
    <T> T decode(byte[] bytes, Class<T> clazz);
}

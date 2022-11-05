package com.yizai.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * 基于 json 的反序列化实现
 *
 * @author yizai
 * @since 2022/10/20 22:43
 */
public class JsonDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}

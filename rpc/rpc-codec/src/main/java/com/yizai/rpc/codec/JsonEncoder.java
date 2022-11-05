package com.yizai.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * 基于 json 的序列化实现
 *
 * @author yizai
 * @since 2022/10/20 18:42
 */
public class JsonEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}

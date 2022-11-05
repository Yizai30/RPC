package com.yizai.rpc.codec;

import junit.framework.TestCase;

public class JsonDecoderTest extends TestCase {

    public void testDecode() {
        Encoder encoder = new JsonEncoder();
        TestBean bean = new TestBean();
        bean.setName("yizai");
        bean.setAge(20);
        byte[] bytes = encoder.encode(bean);
        Decoder decoder = new JsonDecoder();
        TestBean bean2 = decoder.decode(bytes, TestBean.class);
        assertEquals(bean.getName(), bean2.getName());
        assertEquals(bean.getAge(), bean2.getAge());
    }
}
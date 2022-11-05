package com.yizai.rpc.codec;

import junit.framework.TestCase;

public class JsonEncoderTest extends TestCase {

    public void testEncode() {
        Encoder encoder = new JsonEncoder();
        TestBean bean = new TestBean();
        bean.setName("yizai");
        bean.setAge(20);
        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }
}
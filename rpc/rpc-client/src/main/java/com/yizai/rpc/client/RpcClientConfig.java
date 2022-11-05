package com.yizai.rpc.client;

import com.yizai.rpc.Peer;
import com.yizai.rpc.codec.Decoder;
import com.yizai.rpc.codec.Encoder;
import com.yizai.rpc.codec.JsonDecoder;
import com.yizai.rpc.codec.JsonEncoder;
import com.yizai.rpc.transport.HttpTransportClient;
import com.yizai.rpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author yizai
 * @since 2022/10/22 19:08
 */
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass
            = HttpTransportClient.class;
    private Class<? extends Encoder> encoderClass = JsonEncoder.class;
    private Class<? extends Decoder> decoderClass = JsonDecoder.class;
    private Class<? extends TransportSelector> selectorClass
            = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1", 3000)
    );
}

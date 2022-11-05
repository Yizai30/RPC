package com.yizai.rpc.server;

import com.yizai.rpc.codec.Decoder;
import com.yizai.rpc.codec.Encoder;
import com.yizai.rpc.codec.JsonDecoder;
import com.yizai.rpc.codec.JsonEncoder;
import com.yizai.rpc.transport.HttpTransportServer;
import com.yizai.rpc.transport.TransportServer;
import lombok.Data;

/**
 * server 配置
 *
 * @author yizai
 * @since 2022/10/21 00:15
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HttpTransportServer.class;
    private Class<? extends Encoder> encoderClass = JsonEncoder.class;
    private Class<? extends Decoder> decoderClass = JsonDecoder.class;
    private int port = 3000;
}

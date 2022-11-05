package com.yizai.rpc.server;

import com.yizai.rpc.Request;
import com.yizai.rpc.common.utils.ReflectionUtils;

/**
 * 调用具体服务
 *
 * @author yizai
 * @since 2022/10/22 17:39
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service,
                         Request request) {
        return ReflectionUtils.invoke(
          service.getTarget(),
          service.getMethod(),
          request.getParameters()
        );
    }
}

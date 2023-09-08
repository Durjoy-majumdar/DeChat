package com.tencent.map.tools.net.processor;

import com.tencent.map.tools.net.NetResponse;

public interface ResponseProcessor extends Processor {
    void onResponse(NetResponse netResponse);
}

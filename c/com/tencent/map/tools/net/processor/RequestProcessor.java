package com.tencent.map.tools.net.processor;

import com.tencent.map.tools.net.NetRequest;

public interface RequestProcessor extends Processor {
    void onRequest(NetRequest netRequest);
}

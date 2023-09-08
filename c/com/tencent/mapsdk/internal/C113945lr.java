package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.NetUtil;
import com.tencent.map.tools.net.processor.ResponseProcessor;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.tencent.mapsdk.internal.lr */
public class C113945lr implements ResponseProcessor {
    public void onResponse(NetResponse netResponse) {
        try {
            if (netResponse.available()) {
                netResponse.data = NetUtil.toBytesThrow(netResponse.dataStream);
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            C113886kg.m157515a((Closeable) netResponse.dataStream);
            netResponse.dataStream = null;
            throw th;
        }
        C113886kg.m157515a((Closeable) netResponse.dataStream);
        netResponse.dataStream = null;
    }
}

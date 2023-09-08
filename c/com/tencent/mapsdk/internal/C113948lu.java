package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.processor.RequestProcessor;
import com.tencent.map.tools.net.processor.ResponseProcessor;

/* renamed from: com.tencent.mapsdk.internal.lu */
public final class C113948lu implements RequestProcessor, ResponseProcessor {

    /* renamed from: a */
    private final boolean f340827a;

    public C113948lu(boolean z) {
        this.f340827a = z;
    }

    public final void onRequest(NetRequest netRequest) {
        if (this.f340827a) {
            C113889km.m157550c(C0949kl.f2241k, "REQ[" + netRequest.mRequestId + "][" + netRequest.mNetMethod.name() + "]: " + netRequest.toString());
        }
    }

    public final void onResponse(NetResponse netResponse) {
        if (this.f340827a) {
            C113889km.m157550c(C0949kl.f2241k, "RESP[" + netResponse.mRequestId + "]: " + netResponse.toHumanString());
        }
    }
}

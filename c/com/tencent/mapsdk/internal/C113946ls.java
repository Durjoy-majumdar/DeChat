package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.processor.RequestProcessor;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;

/* renamed from: com.tencent.mapsdk.internal.ls */
public final class C113946ls implements RequestProcessor {

    /* renamed from: a */
    private final boolean f340824a;

    private C113946ls(boolean z) {
        this.f340824a = z;
    }

    /* renamed from: a */
    public static C113946ls m157883a(boolean z) {
        return new C113946ls(z);
    }

    public final void onRequest(NetRequest netRequest) {
        if (this.f340824a) {
            String str = netRequest.url;
            if (str.startsWith(HttpWrapperBase.PROTOCAL_HTTP)) {
                str = str.replaceFirst(HttpWrapperBase.PROTOCAL_HTTP, HttpWrapperBase.PROTOCAL_HTTPS);
            }
            netRequest.url = str;
        }
    }
}

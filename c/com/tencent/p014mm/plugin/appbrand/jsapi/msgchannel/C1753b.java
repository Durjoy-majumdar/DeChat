package com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgchannel.b */
public final class C1753b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f11493d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandOnReceiveCacheMsgChannelBatchIPCMessage f11494e;

    public C1753b(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandOnReceiveCacheMsgChannelBatchIPCMessage appBrandOnReceiveCacheMsgChannelBatchIPCMessage) {
        this.f11493d = appBrandRuntimeWC;
        this.f11494e = appBrandOnReceiveCacheMsgChannelBatchIPCMessage;
    }

    public final void run() {
        Log.m105924i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage", "run task and dispatch");
        new C40472e().mo63227s((C88267e) this.f11493d.f238150p, this.f11494e.f11490f);
    }
}

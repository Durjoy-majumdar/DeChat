package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.autogen.events.WCPayWalletBufferEvent;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.p1 */
public class C6294p1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WCPayWalletBufferEvent f23125d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23126e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23127f;

    public C6294p1(MsgHandler msgHandler, WCPayWalletBufferEvent wCPayWalletBufferEvent, C13851h1 h1Var) {
        this.f23127f = msgHandler;
        this.f23125d = wCPayWalletBufferEvent;
        this.f23126e = h1Var;
    }

    public void run() {
        int i = this.f23125d.f9579e.f9590a;
        if (i == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("buffer", this.f23125d.f9579e.f9591b);
            this.f23127f.mo7210k5(this.f23126e, "handleWCPayWalletBuffer:ok", hashMap);
        } else if (i == -2) {
            this.f23127f.mo7210k5(this.f23126e, "handleWCPayWalletBuffer:null", (Map<String, Object>) null);
        } else {
            this.f23127f.mo7210k5(this.f23126e, "handleWCPayWalletBuffer:fail", (Map<String, Object>) null);
        }
    }
}

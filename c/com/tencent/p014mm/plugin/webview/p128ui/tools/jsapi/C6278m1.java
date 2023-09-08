package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import fy3.C32224a;
import java.util.Map;
import rx3.C13598b0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.m1 */
public class C6278m1 implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23086d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23087e;

    public C6278m1(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23087e = msgHandler;
        this.f23086d = h1Var;
    }

    public Object invoke() {
        MsgHandler msgHandler = this.f23087e;
        C13851h1 h1Var = this.f23086d;
        msgHandler.mo7210k5(h1Var, this.f23086d.f38996i + ":cancel", (Map<String, Object>) null);
        this.f23087e.getClass();
        return null;
    }
}

package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import fy3.C32226l;
import java.util.Map;
import rx3.C13598b0;
import s43.C13620a;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.l1 */
public class C6269l1 implements C32226l<C13620a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23073d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23074e;

    public C6269l1(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23074e = msgHandler;
        this.f23073d = h1Var;
    }

    public Object invoke(Object obj) {
        int ordinal = ((C13620a) obj).f38588a.ordinal();
        if (ordinal == 0) {
            MsgHandler msgHandler = this.f23074e;
            C13851h1 h1Var = this.f23073d;
            msgHandler.mo7210k5(h1Var, this.f23073d.f38996i + ":fail", (Map<String, Object>) null);
        } else if (ordinal == 1) {
            MsgHandler msgHandler2 = this.f23074e;
            C13851h1 h1Var2 = this.f23073d;
            msgHandler2.mo7210k5(h1Var2, this.f23073d.f38996i + ":insufficient", (Map<String, Object>) null);
        } else if (ordinal == 2) {
            MsgHandler msgHandler3 = this.f23074e;
            C13851h1 h1Var3 = this.f23073d;
            msgHandler3.mo7210k5(h1Var3, this.f23073d.f38996i + ":intercept", (Map<String, Object>) null);
        }
        this.f23074e.getClass();
        return null;
    }
}

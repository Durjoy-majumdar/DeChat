package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import java.util.HashMap;
import kr0.C76633z0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$a */
public final /* synthetic */ class MsgHandler$$a implements C76633z0.C10404a {

    /* renamed from: a */
    public final /* synthetic */ MsgHandler f22741a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f22742b;

    public /* synthetic */ MsgHandler$$a(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22741a = msgHandler;
        this.f22742b = h1Var;
    }

    /* renamed from: a */
    public final void mo5695a(int i, String str) {
        MsgHandler msgHandler = this.f22741a;
        C13851h1 h1Var = this.f22742b;
        msgHandler.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("retCode", Integer.valueOf(i));
        hashMap.put("errMsg", str);
        msgHandler.mo7210k5(h1Var, "enterWeappContact:ok", hashMap);
    }
}

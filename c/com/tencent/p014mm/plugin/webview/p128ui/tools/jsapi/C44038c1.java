package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import di3.C86312j;
import java.util.HashMap;
import k00.C46630b;
import org.json.JSONObject;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 */
public class C44038c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f119316d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f119317e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c1$a */
    public class C44039a implements C46630b.C46632b {
        public C44039a() {
        }

        /* renamed from: a */
        public void mo5417a(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            hashMap.put("wepkg_info", jSONObject);
            C44038c1 c1Var = C44038c1.this;
            c1Var.f119317e.mo7210k5(c1Var.f119316d, "getLocalWePkgInfo:ok", hashMap);
        }
    }

    public C44038c1(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f119317e = msgHandler;
        this.f119316d = h1Var;
    }

    public void run() {
        ((C46630b) C86312j.m106911c(C46630b.class)).Ps0(new C44039a());
    }
}

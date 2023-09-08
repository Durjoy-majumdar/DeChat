package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import java.util.Map;
import org.json.JSONObject;
import p237sp.C13747c0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c2 */
public class C6219c2 implements C13747c0.C13748a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f22944a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f22945b;

    public C6219c2(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22945b = msgHandler;
        this.f22944a = h1Var;
    }

    /* renamed from: a */
    public void mo287a(String str, JSONObject jSONObject) {
        if (str != null) {
            this.f22945b.mo7210k5(this.f22944a, "pause_download_task:fail", (Map<String, Object>) null);
        } else {
            this.f22945b.mo7210k5(this.f22944a, "pause_download_task:ok", (Map<String, Object>) null);
        }
    }
}

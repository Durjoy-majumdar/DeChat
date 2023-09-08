package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import org.json.JSONObject;
import p237sp.C13747c0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.t1 */
public class C6315t1 implements C13747c0.C13748a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f23190a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f23191b;

    public C6315t1(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23191b = msgHandler;
        this.f23190a = h1Var;
    }

    /* renamed from: a */
    public void mo287a(String str, JSONObject jSONObject) {
        if (!Util.isNullOrNil(str)) {
            MsgHandler msgHandler = this.f23191b;
            C13851h1 h1Var = this.f23190a;
            msgHandler.mo7210k5(h1Var, this.f23190a.f38996i + ":fail_" + str, (Map<String, Object>) null);
            return;
        }
        MsgHandler msgHandler2 = this.f23191b;
        C13851h1 h1Var2 = this.f23190a;
        msgHandler2.mo7210k5(h1Var2, this.f23190a.f38996i + ":ok", MsgHandler.m6109I3(this.f23191b, jSONObject));
    }
}

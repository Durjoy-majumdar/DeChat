package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import org.json.JSONObject;
import p237sp.C13747c0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.w0 */
public class C6325w0 implements C13747c0.C13748a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f23213a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f23214b;

    public C6325w0(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23214b = msgHandler;
        this.f23213a = h1Var;
    }

    /* renamed from: a */
    public void mo287a(String str, JSONObject jSONObject) {
        if (!Util.isNullOrNil(str)) {
            MsgHandler msgHandler = this.f23214b;
            C13851h1 h1Var = this.f23213a;
            msgHandler.mo7210k5(h1Var, this.f23213a.f38996i + ":fail_" + str, (Map<String, Object>) null);
            return;
        }
        MsgHandler msgHandler2 = this.f23214b;
        C13851h1 h1Var2 = this.f23213a;
        msgHandler2.mo7210k5(h1Var2, this.f23213a.f38996i + ":ok", MsgHandler.m6109I3(this.f23214b, jSONObject));
    }
}

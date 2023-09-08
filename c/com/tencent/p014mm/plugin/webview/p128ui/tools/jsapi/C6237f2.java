package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p237sp.C13747c0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.f2 */
public class C6237f2 implements C13747c0.C13748a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f23000a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f23001b;

    public C6237f2(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23001b = msgHandler;
        this.f23000a = h1Var;
    }

    /* renamed from: a */
    public void mo287a(String str, JSONObject jSONObject) {
        if (Util.isNullOrNil(str)) {
            MsgHandler msgHandler = this.f23001b;
            msgHandler.mo7210k5(this.f23000a, "resume_download_task:ok", MsgHandler.m6109I3(msgHandler, jSONObject));
            return;
        }
        MsgHandler msgHandler2 = this.f23001b;
        msgHandler2.mo7210k5(this.f23000a, "resume_download_task:false", MsgHandler.m6109I3(msgHandler2, jSONObject));
    }
}

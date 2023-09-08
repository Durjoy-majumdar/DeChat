package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import p244tt.C14088e;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.t1 */
public final class C6564t1 implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ C13855j f23775a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f23776b;

    public C6564t1(C13855j jVar, C13851h1 h1Var) {
        this.f23775a = jVar;
        this.f23776b = h1Var;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.JsApiOpenLiteApp", "JsApiOpenLiteApp success");
        C13849g gVar = this.f23775a.f39001d;
        String str = this.f23776b.f38990c;
        gVar.mo10774a(str, this.f23776b.f38996i + ": success", (Map<String, Object>) null);
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105924i("MicroMsg.JsApiOpenLiteApp", "JsApiOpenLiteApp fail");
        C13849g gVar = this.f23775a.f39001d;
        String str = this.f23776b.f38990c;
        gVar.mo10774a(str, this.f23776b.f38996i + ": fail open liteapp", (Map<String, Object>) null);
    }
}

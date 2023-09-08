package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.s1 */
public final class C6559s1 implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ C8477a0 f23762a;

    public C6559s1(C8477a0 a0Var) {
        this.f23762a = a0Var;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.JsApiOpenLiteApp", "JsApiOpenLiteApp success");
        this.f23762a.f27482d = true;
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105924i("MicroMsg.JsApiOpenLiteApp", "JsApiOpenLiteApp fail");
        this.f23762a.f27482d = false;
    }
}

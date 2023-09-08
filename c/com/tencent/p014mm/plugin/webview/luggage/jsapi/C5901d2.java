package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import org.json.JSONObject;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.d2 */
public class C5901d2 implements C48478n.C48481f {

    /* renamed from: a */
    public final /* synthetic */ C43620m2.C5947b f22133a;

    public C5901d2(C5883b2 b2Var, C43620m2.C5947b bVar) {
        this.f22133a = bVar;
    }

    /* renamed from: a */
    public void mo6931a(String str) {
        this.f22133a.mo6945a(str, (JSONObject) null);
    }

    public void onCancel() {
        this.f22133a.mo6945a("cancel", (JSONObject) null);
    }

    public void onSuccess() {
        this.f22133a.mo6945a((String) null, (JSONObject) null);
    }
}

package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.p136ui.widget.picker.C7061n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.c3 */
public final class C6416c3<T> implements C7061n.C7062a {

    /* renamed from: a */
    public final /* synthetic */ C7061n f23404a;

    /* renamed from: b */
    public final /* synthetic */ C13855j f23405b;

    /* renamed from: c */
    public final /* synthetic */ C13851h1 f23406c;

    public C6416c3(C7061n nVar, C13855j jVar, C13851h1 h1Var) {
        this.f23404a = nVar;
        this.f23405b = jVar;
        this.f23406c = h1Var;
    }

    /* renamed from: a */
    public final void mo7432a(boolean z, Object obj) {
        C104428a aVar = this.f23404a.f24887d;
        if (aVar != null) {
            aVar.dismiss();
        }
        String str = C6420d3.f23419e;
        Log.m105924i(str, "time set hasSetResult=" + z + ", result=" + obj);
        if (!z) {
            Log.m105924i(str, "time set cancel");
            C13849g gVar = this.f23405b.f39001d;
            String str2 = this.f23406c.f38990c;
            gVar.mo10774a(str2, this.f23406c.f38996i + ":cancel", (Map<String, Object>) null);
            return;
        }
        HashMap hashMap = new HashMap();
        C87412m.m108593f(obj, "result");
        hashMap.put("selectTime", obj);
        C13849g gVar2 = this.f23405b.f39001d;
        String str3 = this.f23406c.f38990c;
        gVar2.mo10774a(str3, this.f23406c.f38996i + ":ok", hashMap);
    }
}

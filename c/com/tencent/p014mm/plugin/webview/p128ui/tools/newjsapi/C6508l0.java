package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import c00.C0408t;
import c00.C92328i;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashMap;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.l0 */
public final class C6508l0 implements C92328i {

    /* renamed from: a */
    public final /* synthetic */ C13855j f23631a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f23632b;

    public C6508l0(C13855j jVar, C13851h1 h1Var) {
        this.f23631a = jVar;
        this.f23632b = h1Var;
    }

    /* renamed from: a */
    public void mo7501a(boolean z) {
        Log.m105924i("MicroMsg.JsApiHandleHaoKanAction", "dismiss is null");
        HashMap hashMap = new HashMap();
        hashMap.put("result", 0);
        hashMap.put("dialogShowed", 1);
        C13849g gVar = this.f23631a.f39001d;
        String str = this.f23632b.f38990c;
        gVar.mo10774a(str, this.f23632b.f38996i + ":ok", hashMap);
        ((C0408t) C86312j.m106911c(C0408t.class)).mo452Qc(2, 2, 1);
    }

    /* renamed from: b */
    public void mo7502b() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", 1);
        hashMap.put("dialogShowed", 1);
        C13849g gVar = this.f23631a.f39001d;
        String str = this.f23632b.f38990c;
        gVar.mo10774a(str, this.f23632b.f38996i + ":ok", hashMap);
        ((C0408t) C86312j.m106911c(C0408t.class)).mo452Qc(1, 2, 1);
    }
}

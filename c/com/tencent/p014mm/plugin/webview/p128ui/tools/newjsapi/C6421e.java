package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import java.util.HashMap;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.e */
public final class C6421e<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23422d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23423e;

    public C6421e(C13855j jVar, C13851h1 h1Var) {
        this.f23422d = jVar;
        this.f23423e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        HashMap hashMap = new HashMap();
        if (((IPCBoolean) obj).f10312d) {
            hashMap.put("ret", 0);
            C13849g gVar = this.f23422d.f39001d;
            String str = this.f23423e.f38990c;
            gVar.mo10774a(str, this.f23423e.f38996i + ":ok", hashMap);
            return;
        }
        hashMap.put("ret", -1);
        C13849g gVar2 = this.f23422d.f39001d;
        String str2 = this.f23423e.f38990c;
        gVar2.mo10774a(str2, this.f23423e.f38996i + ":fail", hashMap);
    }
}

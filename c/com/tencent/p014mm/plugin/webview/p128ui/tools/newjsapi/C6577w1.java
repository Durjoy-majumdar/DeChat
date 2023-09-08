package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.w1 */
public final class C6577w1<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23810d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23811e;

    public C6577w1(C13855j jVar, C13851h1 h1Var) {
        this.f23810d = jVar;
        this.f23811e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        if (((IPCBoolean) obj).f10312d) {
            C13849g gVar = this.f23810d.f39001d;
            String str = this.f23811e.f38990c;
            gVar.mo10774a(str, this.f23811e.f38996i + ":ok", (Map<String, Object>) null);
            return;
        }
        C13849g gVar2 = this.f23810d.f39001d;
        String str2 = this.f23811e.f38990c;
        gVar2.mo10774a(str2, this.f23811e.f38996i + ":fail open fail", (Map<String, Object>) null);
    }
}

package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import java.util.Map;
import rx3.C13604l;
import sx3.C90363p0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.i1 */
public final class C6494i1<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23587d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23588e;

    public C6494i1(C13855j jVar, C13851h1 h1Var) {
        this.f23587d = jVar;
        this.f23588e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCInteger iPCInteger = (IPCInteger) obj;
        int i = iPCInteger.f10313d;
        if (i > 0) {
            C13849g gVar = this.f23587d.f39001d;
            String str = this.f23588e.f38990c;
            gVar.mo10774a(str, this.f23588e.f38996i + ":ok", C90363p0.m113143b(new C13604l("state", Integer.valueOf(iPCInteger.f10313d))));
        } else if (i == -1000) {
            C13849g gVar2 = this.f23587d.f39001d;
            String str2 = this.f23588e.f38990c;
            gVar2.mo10774a(str2, this.f23588e.f38996i + ":fail", (Map<String, Object>) null);
        } else {
            C13849g gVar3 = this.f23587d.f39001d;
            String str3 = this.f23588e.f38990c;
            gVar3.mo10774a(str3, this.f23588e.f38996i + "pre check fail", (Map<String, Object>) null);
        }
    }
}

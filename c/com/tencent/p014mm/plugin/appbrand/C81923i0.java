package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.page.C83768b4;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.appbrand.i0 */
public class C81923i0 implements C87581a<C83928t1, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ String f240278a;

    /* renamed from: b */
    public final /* synthetic */ C81688d0 f240279b;

    public C81923i0(C81688d0 d0Var, String str) {
        this.f240279b = d0Var;
        this.f240278a = str;
    }

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        C83768b4 b4Var = new C83768b4(this.f240278a);
        b4Var.mo114269d0(this.f240279b.f239736b.mo113184O1(false));
        C84217q qVar = C84217q.PreloadBeforeRuntimeInit;
        b4Var.mo124768F1(qVar);
        try {
            C84185b.m103770c(this.f240279b.f239736b.f238147j, true).f245843D = qVar;
        } catch (Exception unused) {
            this.f240279b.mo114030e("doAheadPreloadPageView DONE but get NULL session", new Object[0]);
        }
        return b4Var;
    }
}

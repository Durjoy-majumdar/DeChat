package com.tencent.p014mm.plugin.appbrand.page;

import bt0.C79811f;
import bt0.C79815i;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1$$p */
public class d1$$p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f244610d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f244611e;

    public d1$$p(C83780d1 d1Var, String str) {
        this.f244611e = d1Var;
        this.f244610d = str;
    }

    public void run() {
        C79811f fVar = this.f244611e.f244553E;
        if (fVar != null) {
            fVar.setStatusBarForegroundStyle(C79815i.C79816a.m96974a(this.f244610d) == C79815i.C79816a.BLACK);
        }
    }
}

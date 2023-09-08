package com.tencent.p014mm.plugin.appbrand.page;

import bt0.C79808b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1$$j */
public class d1$$j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f244600d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f244601e;

    public d1$$j(C83780d1 d1Var, String str) {
        this.f244601e = d1Var;
        this.f244600d = str;
    }

    public void run() {
        C79808b bVar = this.f244601e.f244554F;
        if (bVar != null) {
            bVar.setMainTitle(this.f244600d);
        }
    }
}

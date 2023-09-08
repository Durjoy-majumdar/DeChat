package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import lp3.C88633e;
import mp3.C88819d;
import mp3.C88825i;

/* renamed from: com.tencent.mm.plugin.appbrand.d0$$a */
public final /* synthetic */ class d0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81688d0 f239749d;

    public /* synthetic */ d0$$a(C81688d0 d0Var) {
        this.f239749d = d0Var;
    }

    public final void run() {
        C81688d0 d0Var = this.f239749d;
        C88633e<C83928t1> eVar = d0Var.f239748n;
        if (eVar == null) {
            d0Var.mo114033h();
            return;
        }
        C88825i iVar = C88819d.LOGIC;
        eVar.mo114039c(iVar, new C84089r0(d0Var)).mo123066f(iVar, new C84071q0(d0Var));
    }
}

package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;

/* renamed from: com.tencent.mm.plugin.appbrand.d0$$c */
public class d0$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81688d0 f239752d;

    public d0$$c(C81688d0 d0Var) {
        this.f239752d = d0Var;
    }

    public void run() {
        if (!this.f239752d.f239738d) {
            if (this.f239752d.f239741g == null) {
                try {
                    C84185b.m103770c(this.f239752d.f239736b.f238147j, true).f245843D = C84217q.CreateOnRuntimeInit;
                } catch (Exception unused) {
                }
            }
            this.f239752d.mo114031f("countDown == 0, notify process ready", new Object[0]);
            this.f239752d.mo113114c();
        }
    }
}

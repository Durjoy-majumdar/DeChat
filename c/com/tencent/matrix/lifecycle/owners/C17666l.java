package com.tencent.matrix.lifecycle.owners;

import com.tencent.matrix.lifecycle.owners.C17661k;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.owners.l */
public final class C17666l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C17661k.C17664d f48063d;

    public C17666l(C17661k.C17664d dVar) {
        this.f48063d = dVar;
    }

    public void run() {
        C118672d.m167353c(this.f48063d.f48061d.f48054e, "run check task", new Object[0]);
        if (!this.f48063d.f48061d.mo21181a()) {
            this.f48063d.f48061d.f48053d = 0;
            return;
        }
        C17661k kVar = this.f48063d.f48061d;
        if (kVar.f48056g != -1) {
            int i = kVar.f48053d;
            kVar.f48053d = i + 1;
            C17661k kVar2 = this.f48063d.f48061d;
            if (i >= kVar2.f48056g) {
                C118672d.m167353c(kVar2.f48054e, "paused polling check", new Object[0]);
                return;
            }
        }
        long a = this.f48063d.f48061d.mo21183c().mo21188a();
        String str = this.f48063d.f48061d.f48054e;
        C118672d.m167353c(str, "need recheck: next " + a, new Object[0]);
        this.f48063d.f48061d.mo21184d().postDelayed(this, a);
    }
}

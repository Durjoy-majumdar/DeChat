package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.C81634a;

/* renamed from: com.tencent.mm.plugin.appbrand.z1 */
public class C85048z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81108a2 f247832d;

    public C85048z1(C81108a2 a2Var) {
        this.f247832d = a2Var;
    }

    public void run() {
        C81634a F;
        if (!this.f247832d.f238378h.mo113064k0() && (F = this.f247832d.f238378h.mo113008F()) != null) {
            this.f247832d.f238378h.f238296x1.onAppConfigGot(F);
        }
    }
}

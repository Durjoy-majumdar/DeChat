package com.tencent.p014mm.plugin.appbrand;

import bt0.C79808b;
import bt0.C79811f;
import bu0.C79819c;

/* renamed from: com.tencent.mm.plugin.appbrand.n0 */
public class C83703n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83713o0 f244329d;

    public C83703n0(C83713o0 o0Var) {
        this.f244329d = o0Var;
    }

    public void run() {
        if (!this.f244329d.f244357a.f239736b.f238117P && !this.f244329d.f244357a.f239736b.mo113064k0()) {
            Class[] clsArr = {C79808b.class, C79811f.class, C79819c.class};
            for (int i = 0; i < 3; i++) {
                this.f244329d.f244357a.f239736b.mo113028S().mo116281d(clsArr[i]);
            }
        }
    }
}

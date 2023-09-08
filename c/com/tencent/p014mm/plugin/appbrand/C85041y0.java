package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import kr0.C88271f1;
import lp3.C46888b;

/* renamed from: com.tencent.mm.plugin.appbrand.y0 */
public class C85041y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46888b f247817d;

    /* renamed from: e */
    public final /* synthetic */ C85047z0 f247818e;

    public C85041y0(C85047z0 z0Var, C46888b bVar) {
        this.f247818e = z0Var;
        this.f247817d = bVar;
    }

    public void run() {
        C85047z0 z0Var = this.f247818e;
        C88271f1 f1Var = new C88271f1(z0Var.f247829a, z0Var.f247830b);
        f1Var.mo114269d0(this.f247818e.f247831c.f239736b.mo113184O1(false));
        f1Var.mo125518K0(C84217q.PreloadBeforeRuntimeInit);
        this.f247817d.mo72093c(f1Var);
    }
}

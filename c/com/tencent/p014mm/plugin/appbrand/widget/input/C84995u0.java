package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.u0 */
public class C84995u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f247692d;

    /* renamed from: e */
    public final /* synthetic */ boolean f247693e;

    /* renamed from: f */
    public final /* synthetic */ C84983t0 f247694f;

    public C84995u0(C84983t0 t0Var, int i, boolean z) {
        this.f247694f = t0Var;
        this.f247692d = i;
        this.f247693e = z;
    }

    public void run() {
        int i;
        C84983t0 t0Var = this.f247694f;
        int i2 = t0Var.f247672n;
        if (!t0Var.isShown()) {
            this.f247694f.f247672n = 2;
        } else {
            this.f247694f.f247672n = this.f247692d;
        }
        C84983t0 t0Var2 = this.f247694f;
        C84983t0.C84992k kVar = t0Var2.f247671j;
        if (kVar != null && i2 != (i = t0Var2.f247672n) && !this.f247693e) {
            kVar.mo117902a(i);
        }
    }
}

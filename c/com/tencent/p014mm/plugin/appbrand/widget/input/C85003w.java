package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import java.lang.ref.WeakReference;
import js0.C88024r;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.w */
public final class C85003w implements C82531i.C82533b, C82531i.C82534c {

    /* renamed from: d */
    public final WeakReference<C83780d1> f247714d;

    public C85003w(C83780d1 d1Var) {
        this.f247714d = new WeakReference<>(d1Var);
        d1Var.mo114864j(this);
        d1Var.mo114865m(this);
    }

    /* renamed from: b */
    public void mo22089b() {
        C83780d1 d1Var = this.f247714d.get();
        if (d1Var != null) {
            C84947c0.m104715c(d1Var, (Integer) null);
        }
    }

    public void onDestroy() {
        C83780d1 d1Var = this.f247714d.get();
        if (d1Var != null) {
            if (d1Var.getContext() instanceof C84963i1) {
                ((C84963i1) d1Var.getContext()).hideVKB();
            }
            C84947c0.m104715c(d1Var, (Integer) null);
            C88024r.m109572b(new C84946b0(d1Var));
            C84955f.f247608a.mo122466g(d1Var);
            d1Var.mo114863i(this);
            d1Var.mo114867r(this);
            C83797e3 e3Var = d1Var.f244558J;
            if (e3Var != null) {
                C84959i.f247617b.mo117840a(e3Var);
            }
        }
    }
}

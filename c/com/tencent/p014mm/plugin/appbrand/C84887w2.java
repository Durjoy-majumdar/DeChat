package com.tencent.p014mm.plugin.appbrand;

import android.view.View;
import br0.C79778e;
import gy3.C87412m;
import sx3.C110823p;

/* renamed from: com.tencent.mm.plugin.appbrand.w2 */
public class C84887w2 implements C79778e {

    /* renamed from: a */
    public final View f247410a;

    /* renamed from: b */
    public final C79778e.C79780b[] f247411b = {C79778e.C79780b.LANDSCAPE_SENSOR, C79778e.C79780b.LANDSCAPE_LOCKED, C79778e.C79780b.LANDSCAPE_LEFT, C79778e.C79780b.LANDSCAPE_RIGHT};

    public C84887w2(View view) {
        C87412m.m108594g(view, "mView");
        this.f247410a = view;
    }

    /* renamed from: a */
    public C79778e.C79780b mo109917a() {
        return this.f247410a.getHeight() >= this.f247410a.getWidth() ? C79778e.C79780b.PORTRAIT : C79778e.C79780b.LANDSCAPE_LOCKED;
    }

    /* renamed from: b */
    public void mo109918b(C79778e.C79780b bVar, C79778e.C79779a aVar) {
        boolean z = false;
        if (bVar == null) {
            if (aVar != null) {
                aVar.mo109919g((C79778e.C79780b) null, false);
            }
        } else if (bVar == C79778e.C79780b.PORTRAIT) {
            if (aVar != null) {
                C79778e.C79780b a = mo109917a();
                if (mo109917a() == bVar) {
                    z = true;
                }
                aVar.mo109919g(a, z);
            }
        } else if (C110823p.m151009y(this.f247411b, bVar) && aVar != null) {
            aVar.mo109919g(mo109917a(), C110823p.m151009y(this.f247411b, mo109917a()));
        }
    }
}

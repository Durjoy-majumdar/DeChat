package com.tencent.p014mm.plugin.appbrand;

import android.app.Activity;
import android.view.View;
import br0.C39836d;
import br0.C79771a;
import br0.C79773b;
import br0.C79774c;
import br0.C79778e;
import gy3.C87412m;
import u24.C90595a;

/* renamed from: com.tencent.mm.plugin.appbrand.r4 */
public final class C84094r4 extends C79771a {

    /* renamed from: l */
    public final C79774c f245515l;

    /* renamed from: m */
    public Activity f245516m;

    /* renamed from: n */
    public C79778e.C79780b f245517n = C79778e.C79780b.PORTRAIT;

    /* renamed from: o */
    public int f245518o = 1;

    /* renamed from: p */
    public boolean f245519p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84094r4(C79774c cVar, C39836d.C39839b bVar, Activity activity) {
        super(cVar, bVar);
        C87412m.m108594g(cVar, "windowAndroid");
        this.f245515l = cVar;
        this.f245516m = activity;
    }

    /* renamed from: c */
    public void mo62475c(View view, int i) {
        C87412m.m108594g(view, "view");
        super.mo62475c(view, i);
        mo62477e(i);
        for (C79773b e : this.f233787i) {
            e.mo109900e();
        }
        this.f245519p = true;
    }

    /* renamed from: d */
    public boolean mo62476d() {
        boolean z = this.f233789k;
        if (z) {
            this.f245519p = false;
        }
        if (super.mo62476d()) {
            if (C90595a.m113498b(C79778e.C79780b.f233803n, this.f245517n)) {
                this.f245515l.setSoftOrientation("landscape");
            } else {
                this.f245515l.setSoftOrientation("portrait");
            }
            Activity activity = this.f245516m;
            if (activity != null) {
                activity.setRequestedOrientation(this.f245518o);
            }
            mo109899h();
            return true;
        } else if (!z) {
            return false;
        } else {
            this.f233789k = false;
            mo109899h();
            return true;
        }
    }

    /* renamed from: e */
    public void mo62477e(int i) {
        this.f233789k = true;
        String str = (i == -90 || i == 90) ? "landscape" : "portrait";
        C79778e.C79780b a = this.f245515l.getOrientationHandler().mo109917a();
        C87412m.m108593f(a, "windowAndroid.orientatio…andler.currentOrientation");
        this.f245517n = a;
        this.f245515l.setSoftOrientation(str);
        if (this.f245516m != null && C87412m.m108589b(str, "landscape")) {
            Activity activity = this.f245516m;
            C87412m.m108591d(activity);
            if (!C90595a.m113498b(C79778e.C79780b.f233803n, C79778e.C79780b.m96934c(activity.getRequestedOrientation()))) {
                Activity activity2 = this.f245516m;
                C87412m.m108591d(activity2);
                this.f245518o = activity2.getRequestedOrientation();
                Activity activity3 = this.f245516m;
                C87412m.m108591d(activity3);
                activity3.setRequestedOrientation(6);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo116763i() {
        return this.f245519p;
    }

    public void release() {
        super.release();
        this.f245516m = null;
    }
}

package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.appbrand.page.k1 */
public class C83841k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f244714d;

    /* renamed from: e */
    public final /* synthetic */ View f244715e;

    /* renamed from: f */
    public final /* synthetic */ C83780d1 f244716f;

    public C83841k1(C83780d1 d1Var, Context context, View view) {
        this.f244716f = d1Var;
        this.f244714d = context;
        this.f244715e = view;
    }

    public void run() {
        this.f244716f.f244552D = new d1$$s(this.f244716f, this.f244714d);
        C83780d1 d1Var = this.f244716f;
        View t0 = d1Var.mo116196t0(d1Var.f244552D);
        RelativeLayout.LayoutParams r = this.f244716f.mo116158M0().mo111269r(this.f244715e, t0);
        if (t0 != null) {
            ViewGroup viewGroup = this.f244716f.f244552D;
            viewGroup.addView(this.f244715e, viewGroup.getChildCount() - 1, r);
        } else {
            this.f244716f.f244552D.addView(this.f244715e, r);
        }
        this.f244716f.mo116158M0().mo111247W(this.f244715e);
    }
}

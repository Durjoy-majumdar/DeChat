package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fy3.C32224a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.j1 */
public class C83832j1 implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ Context f244698d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f244699e;

    public C83832j1(C83780d1 d1Var, Context context) {
        this.f244699e = d1Var;
        this.f244698d = context;
    }

    public Object invoke() {
        View G = this.f244699e.mo116158M0().mo111241G(LayoutInflater.from(this.f244698d));
        if (G == null) {
            return new FrameLayout(this.f244698d);
        }
        if (G instanceof FrameLayout) {
            return G;
        }
        FrameLayout frameLayout = new FrameLayout(this.f244698d);
        frameLayout.addView(G, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}

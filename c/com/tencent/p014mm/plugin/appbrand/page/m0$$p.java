package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.ValueAnimator;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$p */
public class m0$$p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C83817h4 f244803d;

    /* renamed from: e */
    public final /* synthetic */ C83820i0 f244804e;

    /* renamed from: f */
    public final /* synthetic */ C83820i0 f244805f;

    /* renamed from: g */
    public final /* synthetic */ C83849m0 f244806g;

    public m0$$p(C83849m0 m0Var, C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        this.f244806g = m0Var;
        this.f244803d = h4Var;
        this.f244804e = i0Var;
        this.f244805f = i0Var2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f244806g.mo116362n(this.f244803d, this.f244804e, this.f244805f, (float) ((int) (valueAnimator.getAnimatedFraction() * 100.0f)));
    }
}

package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$o */
public class m0$$o extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C83817h4 f244799d;

    /* renamed from: e */
    public final /* synthetic */ C83820i0 f244800e;

    /* renamed from: f */
    public final /* synthetic */ C83820i0 f244801f;

    /* renamed from: g */
    public final /* synthetic */ C83849m0 f244802g;

    public m0$$o(C83849m0 m0Var, C83817h4 h4Var, C83820i0 i0Var, C83820i0 i0Var2) {
        this.f244802g = m0Var;
        this.f244799d = h4Var;
        this.f244800e = i0Var;
        this.f244801f = i0Var2;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f244802g.mo116360l(this.f244799d, this.f244800e, this.f244801f);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f244802g.mo116361m(this.f244799d, this.f244800e, this.f244801f);
    }
}

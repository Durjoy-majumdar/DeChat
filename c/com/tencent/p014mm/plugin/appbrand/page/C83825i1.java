package com.tencent.p014mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.appbrand.page.i1 */
public class C83825i1 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f244695d;

    public C83825i1(C83780d1 d1Var) {
        this.f244695d = d1Var;
    }

    public void onAnimationCancel(Animator animator) {
        this.f244695d.f244579Z.remove(animator);
    }

    public void onAnimationEnd(Animator animator) {
        this.f244695d.f244579Z.remove(animator);
    }
}

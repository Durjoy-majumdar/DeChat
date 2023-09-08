package com.tencent.p014mm.plugin.luckymoney.story;

import android.animation.Animator;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.q */
public class C69327q implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199618d;

    public C69327q(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199618d = envelopeAppBarLayout;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f199618d.f199481R.setVisibility(8);
        EnvelopeAppBarLayout envelopeAppBarLayout = this.f199618d;
        TouchCoordinatorLayout touchCoordinatorLayout = envelopeAppBarLayout.f199526x;
        if (touchCoordinatorLayout != null) {
            touchCoordinatorLayout.f199577E = false;
        }
        envelopeAppBarLayout.f199464C1 = true;
        envelopeAppBarLayout.mo95442o();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}

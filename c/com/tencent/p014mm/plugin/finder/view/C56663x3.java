package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;

/* renamed from: com.tencent.mm.plugin.finder.view.x3 */
public final class C56663x3 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostFooter f162420d;

    public C56663x3(FinderPostFooter finderPostFooter) {
        this.f162420d = finderPostFooter;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f162420d.getSmileyPanel().setAlpha(1.0f);
        this.f162420d.getSmileyPanel().setVisibility(4);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}

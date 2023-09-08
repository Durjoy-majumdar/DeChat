package com.tencent.p014mm.plugin.finder.p056ui;

import android.animation.Animator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.c1 */
public final class C93772c1 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ MultiTouchImageView f270655d;

    /* renamed from: e */
    public final /* synthetic */ FinderImagePreviewUI f270656e;

    public C93772c1(MultiTouchImageView multiTouchImageView, FinderImagePreviewUI finderImagePreviewUI) {
        this.f270655d = multiTouchImageView;
        this.f270656e = finderImagePreviewUI;
    }

    public void onAnimationCancel(Animator animator) {
        C87412m.m108594g(animator, "animation");
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        this.f270656e.finish();
        this.f270656e.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    public void onAnimationRepeat(Animator animator) {
        C87412m.m108594g(animator, "animation");
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animation");
        if (this.f270655d.getScale() > 1.0f) {
            this.f270655d.mo26059d();
        }
        this.f270656e.f270647y = this.f270655d.getTranslationX();
        this.f270656e.f270648z = this.f270655d.getTranslationY();
        this.f270656e.f270645w = this.f270655d.getScaleX();
        this.f270656e.f270646x = this.f270655d.getScaleY();
    }
}

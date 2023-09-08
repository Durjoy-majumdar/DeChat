package com.tencent.p014mm.plugin.luckymoney.story;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.n */
public class C69324n implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ ObjectAnimator f199613d;

    /* renamed from: e */
    public final /* synthetic */ EnvelopeAppBarLayout f199614e;

    public C69324n(EnvelopeAppBarLayout envelopeAppBarLayout, ObjectAnimator objectAnimator) {
        this.f199614e = envelopeAppBarLayout;
        this.f199613d = objectAnimator;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "has animator end");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "start fade animator");
        if (this.f199613d.isRunning()) {
            EnvelopeAppBarLayout envelopeAppBarLayout = this.f199614e;
            int i = EnvelopeAppBarLayout.f199458F1;
            envelopeAppBarLayout.getClass();
            Rect rect = new Rect();
            envelopeAppBarLayout.f199524w.getGlobalVisibleRect(rect);
            envelopeAppBarLayout.f199524w.setTranslationY(((float) (envelopeAppBarLayout.f199527x0 - rect.bottom)) / 2.0f);
            envelopeAppBarLayout.f199491W = true;
            Log.m105919d("MicroMsg.EnvelopeAppBarLayout", "translate pager view: %s", Float.valueOf(envelopeAppBarLayout.f199524w.getTranslationY()));
        }
    }
}

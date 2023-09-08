package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import zo3.C79405a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.d1 */
public final class C72778d1 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f212138d;

    /* renamed from: e */
    public final /* synthetic */ C72852z0 f212139e;

    public C72778d1(ViewPropertyAnimator viewPropertyAnimator, C72852z0 z0Var) {
        this.f212138d = viewPropertyAnimator;
        this.f212139e = z0Var;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f212138d.setListener((Animator.AnimatorListener) null);
        this.f212138d.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
        View f = this.f212139e.mo100693f();
        f.setOutlineProvider(new C79405a(true, false, 0.0f));
        f.setClipToOutline(true);
        this.f212139e.mo100689b().setVisibility(0);
    }
}

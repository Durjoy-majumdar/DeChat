package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.n6 */
public final class C4124n6 implements Animator.AnimatorListener {

    /* renamed from: d */
    public View f18298d;

    /* renamed from: e */
    public C32224a<C13598b0> f18299e;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C13598b0 b0Var;
        View view = this.f18298d;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        C32224a<C13598b0> aVar = this.f18299e;
        if (aVar != null) {
            aVar.invoke();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i("FinderLiveSlideAnimHelper", "HorizontalAnimationListener onAnimationEnd onAnimationEnd：" + this.f18299e);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}

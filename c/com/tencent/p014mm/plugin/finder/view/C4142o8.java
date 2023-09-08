package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.o8 */
public final class C4142o8 implements Animator.AnimatorListener {

    /* renamed from: d */
    public View f18364d;

    /* renamed from: e */
    public C32224a<C13598b0> f18365e;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C13598b0 b0Var;
        View view = this.f18364d;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        C32224a<C13598b0> aVar = this.f18365e;
        if (aVar != null) {
            aVar.invoke();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i("FinderLiveSlideAnimHelper", "VerticalAnimationListener onAnimationEnd：" + this.f18365e);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}

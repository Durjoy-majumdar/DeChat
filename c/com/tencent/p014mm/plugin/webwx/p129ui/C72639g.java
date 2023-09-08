package com.tencent.p014mm.plugin.webwx.p129ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webwx.ui.g */
public final class C72639g extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C72632c f211347d;

    public C72639g(C72632c cVar) {
        this.f211347d = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        super.onAnimationEnd(animator);
        C72632c cVar = this.f211347d;
        cVar.mo100076B(cVar.f211334y0);
    }
}

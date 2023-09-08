package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.o1 */
public final class C41596o1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentFooter f111964d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41596o1(FinderCommentFooter finderCommentFooter) {
        super(0);
        this.f111964d = finderCommentFooter;
    }

    public Object invoke() {
        this.f111964d.animate().setInterpolator(new DecelerateInterpolator()).setDuration(220).setListener((Animator.AnimatorListener) null).translationY(0.0f).start();
        return C13598b0.f38549a;
    }
}

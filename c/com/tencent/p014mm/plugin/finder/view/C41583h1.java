package com.tencent.p014mm.plugin.finder.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import gy3.C87412m;
import iy3.C60641c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.view.h1 */
public final class C41583h1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentFooter f111928d;

    public C41583h1(FinderCommentFooter finderCommentFooter) {
        this.f111928d = finderCommentFooter;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = (float) ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this.f111928d.getReplyBtn().getLayoutParams();
        layoutParams.width = C60641c.m70921b(intValue);
        this.f111928d.getReplyBtn().setLayoutParams(layoutParams);
        View replyBtn = this.f111928d.getReplyBtn();
        float replyBtnWidth = intValue / ((float) this.f111928d.getReplyBtnWidth());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(replyBtnWidth));
        View view = replyBtn;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$checkShowReplyBtn$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        replyBtn.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$checkShowReplyBtn$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}

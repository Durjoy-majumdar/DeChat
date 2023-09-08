package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.n0 */
public class C72812n0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212207d;

    public C72812n0(ChatFooter chatFooter) {
        this.f212207d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((ViewGroup.MarginLayoutParams) this.f212207d.f211793O2.getLayoutParams()).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f212207d.f211793O2.requestLayout();
    }
}

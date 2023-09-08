package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.o0 */
public class C72815o0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212210d;

    public C72815o0(ChatFooter chatFooter) {
        this.f212210d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((ViewGroup.MarginLayoutParams) this.f212210d.f211793O2.getLayoutParams()).width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f212210d.f211793O2.requestLayout();
    }
}

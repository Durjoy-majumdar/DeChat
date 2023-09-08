package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$b1 */
public class ChatFooter$$b1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211981d;

    public ChatFooter$$b1(ChatFooter chatFooter) {
        this.f211981d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((ViewGroup.MarginLayoutParams) this.f211981d.f211793O2.getLayoutParams()).width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f211981d.f211793O2.requestLayout();
    }
}

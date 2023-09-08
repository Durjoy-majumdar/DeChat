package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$o0 */
public class ChatFooter$$o0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212025d;

    public ChatFooter$$o0(ChatFooter chatFooter) {
        this.f212025d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f212025d.f211793O2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f212025d.f211793O2.requestLayout();
    }
}

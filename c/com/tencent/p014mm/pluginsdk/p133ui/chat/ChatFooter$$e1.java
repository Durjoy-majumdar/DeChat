package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$e1 */
public class ChatFooter$$e1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211991d;

    public ChatFooter$$e1(ChatFooter chatFooter) {
        this.f211991d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f211991d.f211793O2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

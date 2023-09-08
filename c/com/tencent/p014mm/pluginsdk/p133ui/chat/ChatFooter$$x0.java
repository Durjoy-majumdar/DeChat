package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$x0 */
public class ChatFooter$$x0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212069d;

    public ChatFooter$$x0(ChatFooter chatFooter) {
        this.f212069d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.f212069d.f211905n.getLayoutParams();
        layoutParams.width = intValue;
        this.f212069d.f211905n.setLayoutParams(layoutParams);
        ChatFooter chatFooter = this.f212069d;
        int i = chatFooter.f211877g4;
        chatFooter.f211905n.setAlpha(((float) (intValue - i)) / ((float) (chatFooter.f211872f4 - i)));
    }
}

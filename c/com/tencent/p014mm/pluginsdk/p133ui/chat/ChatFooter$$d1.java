package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$d1 */
public class ChatFooter$$d1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211988d;

    public ChatFooter$$d1(ChatFooter chatFooter) {
        this.f211988d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((ViewGroup.MarginLayoutParams) this.f211988d.f211793O2.getLayoutParams()).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f211988d.f211793O2.requestLayout();
    }
}

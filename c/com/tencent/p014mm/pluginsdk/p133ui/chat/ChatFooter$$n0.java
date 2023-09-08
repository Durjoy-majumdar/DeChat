package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$n0 */
public class ChatFooter$$n0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212023d;

    public ChatFooter$$n0(ChatFooter chatFooter) {
        this.f212023d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((ViewGroup.MarginLayoutParams) this.f212023d.f211793O2.getLayoutParams()).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f212023d.f211793O2.requestLayout();
    }
}

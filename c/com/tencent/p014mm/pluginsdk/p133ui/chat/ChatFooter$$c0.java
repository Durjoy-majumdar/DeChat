package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.C74942w4;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$c0 */
public class ChatFooter$$c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211984d;

    public ChatFooter$$c0(ChatFooter chatFooter) {
        this.f211984d = chatFooter;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f211984d.f211908n3.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f211984d.f211913o3.getLayoutParams();
        ChatFooter chatFooter = this.f211984d;
        if (chatFooter.f211759F3 == valueAnimator) {
            layoutParams.width = C74942w4.m89784a(chatFooter.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.width = C74942w4.m89784a(this.f211984d.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (chatFooter.f211763G3 == valueAnimator) {
            layoutParams.height = C74942w4.m89784a(chatFooter.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.height = C74942w4.m89784a(this.f211984d.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (chatFooter.f211767H3 == valueAnimator) {
            layoutParams.topMargin = C74942w4.m89784a(chatFooter.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.topMargin = C74942w4.m89784a(this.f211984d.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (chatFooter.f211771I3 == valueAnimator) {
            layoutParams.rightMargin = C74942w4.m89784a(chatFooter.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.rightMargin = C74942w4.m89784a(this.f211984d.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (chatFooter.f211775J3 == valueAnimator) {
            layoutParams.bottomMargin = C74942w4.m89784a(chatFooter.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.bottomMargin = C74942w4.m89784a(this.f211984d.getContext(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        this.f211984d.f211908n3.setLayoutParams(layoutParams);
        this.f211984d.f211913o3.setLayoutParams(layoutParams2);
    }
}

package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.plugin.account.ui.WelcomeView */
public abstract class WelcomeView extends LinearLayout {

    /* renamed from: com.tencent.mm.plugin.account.ui.WelcomeView$a */
    public class C115083a implements Animation.AnimationListener {
        public C115083a(WelcomeView welcomeView) {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public WelcomeView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo174851a(View view, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new C115083a(this));
        view.startAnimation(alphaAnimation);
    }

    public WelcomeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package com.tencent.p014mm.plugin.profile.p088ui;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.profile.ui.a3 */
public class C4981a3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f20265d;

    public C4981a3(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, TextView textView) {
        this.f20265d = textView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f20265d.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

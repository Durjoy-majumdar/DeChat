package com.tencent.p014mm.plugin.luckymoney.story;

import android.animation.ValueAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.p */
public class C69326p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public int f199616d = 0;

    /* renamed from: e */
    public final /* synthetic */ EnvelopeAppBarLayout f199617e;

    public C69326p(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199617e = envelopeAppBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "animate value: " + valueAnimator.getAnimatedValue());
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = intValue - this.f199616d;
        this.f199616d = intValue;
        EnvelopeAppBarLayout envelopeAppBarLayout = this.f199617e;
        int i2 = envelopeAppBarLayout.f199480Q0;
        float f = ((float) (i2 - intValue)) / (((float) i2) * 1.0f);
        if (envelopeAppBarLayout.f199499d1 == 2) {
            envelopeAppBarLayout.f199516s.setAlpha(f);
            this.f199617e.f199518t.setAlpha(f);
        }
        this.f199617e.offsetTopAndBottom(i);
        if (i > 0) {
            this.f199617e.f199481R.offsetTopAndBottom((int) (((float) i) * 0.123f));
        } else {
            this.f199617e.f199529y.setAlpha(f);
        }
    }
}

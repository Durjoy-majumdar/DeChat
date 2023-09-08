package com.tencent.p014mm.plugin.fav.p047ui;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.plugin.fav.ui.f2 */
public class C93600f2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f270292d;

    /* renamed from: e */
    public final /* synthetic */ PhotoTransControl f270293e;

    public C93600f2(PhotoTransControl photoTransControl, int i) {
        this.f270293e = photoTransControl;
        this.f270292d = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.1f) {
            this.f270293e.f269951g.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            this.f270293e.f269951g.setAlpha((1.0f - floatValue) * 10.0f);
        }
        ImageView imageView = this.f270293e.f269951g;
        imageView.setTranslationY(floatValue * ((float) (this.f270292d - imageView.getHeight())));
    }
}

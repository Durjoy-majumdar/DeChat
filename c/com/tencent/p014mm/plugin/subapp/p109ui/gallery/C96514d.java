package com.tencent.p014mm.plugin.subapp.p109ui.gallery;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.d */
public class C96514d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f282413d;

    /* renamed from: e */
    public final /* synthetic */ GestureGalleryTransAndOcrLogic f282414e;

    public C96514d(GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic, int i) {
        this.f282414e = gestureGalleryTransAndOcrLogic;
        this.f282413d = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.1f) {
            this.f282414e.f282243h.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            this.f282414e.f282243h.setAlpha((1.0f - floatValue) * 10.0f);
        }
        ImageView imageView = this.f282414e.f282243h;
        imageView.setTranslationY(floatValue * ((float) (this.f282413d - imageView.getHeight())));
    }
}

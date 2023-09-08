package com.tencent.p014mm.p136ui.chatting.gallery;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.ui.chatting.gallery.z */
public class C73714z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f216456d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f216457e;

    public C73714z(ImageGalleryUI imageGalleryUI, int i) {
        this.f216457e = imageGalleryUI;
        this.f216456d = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.1f) {
            this.f216457e.f284378N1.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            this.f216457e.f284378N1.setAlpha((1.0f - floatValue) * 10.0f);
        }
        ImageView imageView = this.f216457e.f284378N1;
        imageView.setTranslationY(floatValue * ((float) (this.f216456d - imageView.getHeight())));
    }
}

package bj3;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: bj3.a */
public final class C0305a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f879d;

    /* renamed from: e */
    public final /* synthetic */ float f880e;

    public C0305a(View view, float f) {
        this.f879d = view;
        this.f880e = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float alpha = this.f879d.getAlpha() + ((this.f880e - this.f879d.getAlpha()) * valueAnimator.getAnimatedFraction());
        Drawable background = this.f879d.getBackground();
        if (background != null) {
            background.setAlpha((int) (((float) 255) * alpha));
        }
    }
}

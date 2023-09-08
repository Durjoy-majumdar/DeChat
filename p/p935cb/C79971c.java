package p935cb;

import android.animation.ValueAnimator;

/* renamed from: cb.c */
public class C79971c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public int f234242d;

    /* renamed from: e */
    public final /* synthetic */ C79973e f234243e;

    public C79971c(C79973e eVar) {
        this.f234243e = eVar;
        this.f234242d = eVar.mo110150a();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
            this.f234243e.f234247a.setVisibility(8);
            return;
        }
        this.f234243e.f234247a.mo110155d(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f234242d));
        this.f234243e.f234247a.requestLayout();
    }
}

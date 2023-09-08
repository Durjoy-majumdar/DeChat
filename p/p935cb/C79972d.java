package p935cb;

import android.animation.ValueAnimator;

/* renamed from: cb.d */
public class C79972d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public int f234244d;

    /* renamed from: e */
    public final /* synthetic */ C79973e f234245e;

    public C79972d(C79973e eVar) {
        this.f234245e = eVar;
        this.f234244d = eVar.mo110150a();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f234245e.f234247a.mo110155d(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f234244d));
        this.f234245e.f234247a.requestLayout();
    }
}

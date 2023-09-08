package p1010nc;

import android.animation.ValueAnimator;

/* renamed from: nc.e */
public class C88920e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public int f256464d;

    /* renamed from: e */
    public final /* synthetic */ C88916a f256465e;

    public C88920e(C88916a aVar) {
        this.f256465e = aVar;
        this.f256464d = aVar.mo123302a();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((C88922g) this.f256465e.f256451a).f256467a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f256464d));
        ((C88922g) this.f256465e.f256451a).f256467a.requestLayout();
    }
}

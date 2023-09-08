package p1010nc;

import android.animation.ValueAnimator;

/* renamed from: nc.d */
public class C88919d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public int f256462d;

    /* renamed from: e */
    public final /* synthetic */ C88916a f256463e;

    public C88919d(C88916a aVar) {
        this.f256463e = aVar;
        this.f256462d = aVar.mo123302a();
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
            ((C88922g) this.f256463e.f256451a).f256467a.setVisibility(8);
            return;
        }
        ((C88922g) this.f256463e.f256451a).f256467a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f256462d));
        ((C88922g) this.f256463e.f256451a).f256467a.requestLayout();
    }
}

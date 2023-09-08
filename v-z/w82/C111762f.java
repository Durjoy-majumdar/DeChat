package w82;

import android.animation.ValueAnimator;

/* renamed from: w82.f */
public final class C111762f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C111759e f334688d;

    /* renamed from: e */
    public final /* synthetic */ float f334689e;

    /* renamed from: f */
    public final /* synthetic */ float f334690f;

    /* renamed from: g */
    public final /* synthetic */ float f334691g;

    /* renamed from: h */
    public final /* synthetic */ float f334692h;

    public C111762f(C111759e eVar, float f, float f2, float f3, float f4) {
        this.f334688d = eVar;
        this.f334689e = f;
        this.f334690f = f2;
        this.f334691g = f3;
        this.f334692h = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f334688d.f334677c.setX((valueAnimator.getAnimatedFraction() * this.f334689e) + this.f334690f);
        this.f334688d.f334677c.setY((valueAnimator.getAnimatedFraction() * this.f334691g) + this.f334692h);
    }
}

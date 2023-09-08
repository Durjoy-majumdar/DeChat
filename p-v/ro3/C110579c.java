package ro3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import android.widget.Magnifier;
import gy3.C87412m;

/* renamed from: ro3.c */
public final class C110579c {

    /* renamed from: a */
    public Magnifier f330774a;

    /* renamed from: b */
    public final ValueAnimator f330775b;

    /* renamed from: c */
    public boolean f330776c;

    /* renamed from: d */
    public float f330777d;

    /* renamed from: e */
    public float f330778e;

    /* renamed from: f */
    public float f330779f;

    /* renamed from: g */
    public float f330780g;

    /* renamed from: h */
    public float f330781h;

    /* renamed from: i */
    public float f330782i;

    /* renamed from: ro3.c$a */
    public static final class C110580a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C110579c f330783d;

        public C110580a(C110579c cVar) {
            this.f330783d = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C110579c cVar = this.f330783d;
            float f = cVar.f330777d;
            cVar.f330779f = f + ((cVar.f330781h - f) * valueAnimator.getAnimatedFraction());
            C110579c cVar2 = this.f330783d;
            float f2 = cVar2.f330778e;
            cVar2.f330780g = f2 + ((cVar2.f330782i - f2) * valueAnimator.getAnimatedFraction());
            if (Build.VERSION.SDK_INT >= 28) {
                C110579c cVar3 = this.f330783d;
                cVar3.f330774a.show(cVar3.f330779f, cVar3.f330780g);
            }
        }
    }

    public C110579c(Magnifier magnifier) {
        C87412m.m108594g(magnifier, "mMagnifier");
        this.f330774a = magnifier;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C87412m.m108593f(ofFloat, "ofFloat(0f, 1f)");
        this.f330775b = ofFloat;
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C110580a(this));
    }

    /* renamed from: a */
    public final void mo162103a() {
        this.f330774a.dismiss();
        this.f330775b.cancel();
        this.f330776c = false;
    }
}

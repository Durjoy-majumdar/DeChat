package kl1;

import android.animation.ValueAnimator;
import gy3.C8477a0;
import gy3.C87412m;
import kotlin.Result;
import wx3.C15601d;

/* renamed from: kl1.j */
public final class C10325j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C10305d f31461d;

    /* renamed from: e */
    public final /* synthetic */ int f31462e;

    /* renamed from: f */
    public final /* synthetic */ boolean f31463f;

    /* renamed from: g */
    public final /* synthetic */ C8477a0 f31464g;

    /* renamed from: h */
    public final /* synthetic */ C15601d<Boolean> f31465h;

    public C10325j(C10305d dVar, int i, boolean z, C8477a0 a0Var, C15601d<? super Boolean> dVar2) {
        this.f31461d = dVar;
        this.f31462e = i;
        this.f31463f = z;
        this.f31464g = a0Var;
        this.f31465h = dVar2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float f = (float) 1;
        this.f31461d.f31408a.f31488e.setTranslationX(((float) this.f31462e) * (f - floatValue));
        if (this.f31463f) {
            this.f31461d.f31408a.f31488e.setAlpha(f * floatValue);
        }
        if (C87412m.m108589b(valueAnimator.getAnimatedValue(), Float.valueOf(1.0f))) {
            C8477a0 a0Var = this.f31464g;
            if (!a0Var.f27482d) {
                a0Var.f27482d = true;
                C15601d<Boolean> dVar = this.f31465h;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            }
        }
    }
}

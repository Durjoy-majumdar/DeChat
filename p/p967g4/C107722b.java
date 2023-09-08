package p967g4;

import android.animation.ValueAnimator;
import p967g4.C107724d;

/* renamed from: g4.b */
public class C107722b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C107724d.C107725a f322316d;

    /* renamed from: e */
    public final /* synthetic */ C107724d f322317e;

    public C107722b(C107724d dVar, C107724d.C107725a aVar) {
        this.f322317e = dVar;
        this.f322316d = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f322317e.mo158134d(floatValue, this.f322316d);
        this.f322317e.mo158131a(floatValue, this.f322316d, false);
        this.f322317e.invalidateSelf();
    }
}

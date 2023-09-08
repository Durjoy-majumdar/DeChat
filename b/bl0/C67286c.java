package bl0;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: bl0.c */
public class C67286c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f193118d;

    public C67286c(C67288e eVar, View view) {
        this.f193118d = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f193118d.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

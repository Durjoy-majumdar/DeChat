package qj1;

import android.animation.ValueAnimator;
import android.widget.ProgressBar;
import gy3.C87412m;

/* renamed from: qj1.y */
public final class C63114y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C63064w f179106d;

    public C63114y(C63064w wVar) {
        this.f179106d = wVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f179106d.f178970t.setMax(100);
        ProgressBar progressBar = this.f179106d.f178970t;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((Integer) animatedValue).intValue());
    }
}

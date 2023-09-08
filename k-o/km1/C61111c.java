package km1;

import android.animation.ValueAnimator;
import android.widget.RelativeLayout;
import gy3.C87412m;

/* renamed from: km1.c */
public final class C61111c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C61117j f173985d;

    public C61111c(C61117j jVar) {
        this.f173985d = jVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C61117j jVar = this.f173985d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        jVar.f174000j = ((Integer) animatedValue).intValue();
        C61117j jVar2 = this.f173985d;
        RelativeLayout relativeLayout = jVar2.f173998h;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(jVar2.f174000j);
        }
    }
}

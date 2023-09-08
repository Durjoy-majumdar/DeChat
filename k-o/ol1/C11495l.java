package ol1;

import android.animation.ValueAnimator;
import android.view.View;
import gy3.C87412m;
import qo3.C12925w;

/* renamed from: ol1.l */
public final class C11495l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f33789d;

    public C11495l(C12925w wVar) {
        this.f33789d = wVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f33789d.f36927f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
    }
}

package vs1;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import gy3.C87412m;
import vs1.C15003o;

/* renamed from: vs1.p */
public final class C15005p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C15003o.C15004a f41132d;

    public C15005p(C15003o.C15004a aVar) {
        this.f41132d = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = this.f41132d.f41130C.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((ConstraintLayout.LayoutParams) layoutParams).f44422N = ((Float) animatedValue).floatValue();
        this.f41132d.f41130C.requestLayout();
    }
}

package p33;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import gy3.C87412m;

/* renamed from: p33.d */
public final class C11814d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f34557d;

    /* renamed from: e */
    public final /* synthetic */ C110140b f34558e;

    public C11814d(View view, C110140b bVar) {
        this.f34557d = view;
        this.f34558e = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = this.f34557d.getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            C110140b bVar = this.f34558e;
            View view = this.f34557d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.y = ((Integer) animatedValue).intValue();
            ViewManager viewManager = bVar.f329508d;
            if (viewManager != null) {
                viewManager.updateViewLayout(view, layoutParams2);
            }
        }
    }
}

package ub2;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: ub2.k0 */
public final class C14145k0 extends C87413o implements C32224a<ValueAnimator> {

    /* renamed from: d */
    public static final C14145k0 f39576d = new C14145k0();

    public C14145k0() {
        super(0);
    }

    public Object invoke() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 0.07f});
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(300);
        return ofFloat;
    }
}

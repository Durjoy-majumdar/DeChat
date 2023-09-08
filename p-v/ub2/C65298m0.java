package ub2;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: ub2.m0 */
public final class C65298m0 extends C87413o implements C32224a<ValueAnimator> {

    /* renamed from: d */
    public static final C65298m0 f187956d = new C65298m0();

    public C65298m0() {
        super(0);
    }

    public Object invoke() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f});
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofFloat;
    }
}

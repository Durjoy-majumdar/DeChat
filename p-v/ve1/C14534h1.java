package ve1;

import android.animation.ValueAnimator;
import android.graphics.PathMeasure;
import com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout;
import gy3.C87412m;

/* renamed from: ve1.h1 */
public final class C14534h1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ PathMeasure f40279d;

    /* renamed from: e */
    public final /* synthetic */ float[] f40280e;

    /* renamed from: f */
    public final /* synthetic */ RoundLinearLayout f40281f;

    public C14534h1(PathMeasure pathMeasure, float[] fArr, RoundLinearLayout roundLinearLayout) {
        this.f40279d = pathMeasure;
        this.f40280e = fArr;
        this.f40281f = roundLinearLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this.f40279d.getPosTan(floatValue, this.f40280e, (float[]) null);
        float length = floatValue / (this.f40279d.getLength() * 0.5f);
        if (length < 0.0f) {
            length = 0.0f;
        }
        if (length > 1.0f) {
            length = 1.0f;
        }
        this.f40281f.setScaleX(length);
        this.f40281f.setScaleY(length);
        this.f40281f.setX(this.f40280e[0]);
        this.f40281f.setY(this.f40280e[1]);
    }
}

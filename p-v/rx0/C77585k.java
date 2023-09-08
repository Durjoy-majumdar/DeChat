package rx0;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import gy3.C87412m;

/* renamed from: rx0.k */
public final class C77585k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C77587m f226187d;

    public C77585k(C77587m mVar) {
        this.f226187d = mVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C77587m mVar = this.f226187d;
        Object animatedValue = valueAnimator.getAnimatedValue("translateX");
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        mVar.setTranslationX(((Float) animatedValue).floatValue());
        C77587m mVar2 = this.f226187d;
        Object animatedValue2 = valueAnimator.getAnimatedValue("translateY");
        C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        mVar2.setTranslationY(((Float) animatedValue2).floatValue());
        Paint paint = this.f226187d.f226190e;
        C87412m.m108591d(paint);
        Object animatedValue3 = valueAnimator.getAnimatedValue("alpha");
        C87412m.m108592e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
        paint.setAlpha(((Integer) animatedValue3).intValue());
        C77587m mVar3 = this.f226187d;
        RectF rectF = mVar3.f226194i;
        if (rectF == null) {
            C87412m.m108603p("mMaskRect");
            throw null;
        } else if (rectF != null) {
            float f = rectF.left;
            Object animatedValue4 = valueAnimator.getAnimatedValue("scaleX");
            C87412m.m108592e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
            rectF.right = f + (((float) mVar3.f226196n) * ((Float) animatedValue4).floatValue());
            C77587m mVar4 = this.f226187d;
            RectF rectF2 = mVar4.f226194i;
            if (rectF2 == null) {
                C87412m.m108603p("mMaskRect");
                throw null;
            } else if (rectF2 != null) {
                float f2 = rectF2.top;
                Object animatedValue5 = valueAnimator.getAnimatedValue("scaleY");
                C87412m.m108592e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                rectF2.bottom = f2 + (((float) mVar4.f226197o) * ((Float) animatedValue5).floatValue());
                this.f226187d.postInvalidate();
            } else {
                C87412m.m108603p("mMaskRect");
                throw null;
            }
        } else {
            C87412m.m108603p("mMaskRect");
            throw null;
        }
    }
}

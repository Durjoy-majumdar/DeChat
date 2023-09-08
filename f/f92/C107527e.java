package f92;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import gy3.C87412m;

/* renamed from: f92.e */
public final class C107527e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C107529g f321712d;

    public C107527e(C107529g gVar) {
        this.f321712d = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C107529g gVar = this.f321712d;
        Object animatedValue = valueAnimator.getAnimatedValue("canvasTranslationX");
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        gVar.f321721n = ((Integer) animatedValue).intValue();
        RectF rectF = this.f321712d.f321720j;
        if (rectF != null) {
            Object animatedValue2 = valueAnimator.getAnimatedValue("translationX");
            C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            rectF.left = (float) ((Integer) animatedValue2).intValue();
            RectF rectF2 = this.f321712d.f321720j;
            if (rectF2 != null) {
                Object animatedValue3 = valueAnimator.getAnimatedValue("translationY");
                C87412m.m108592e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                rectF2.top = (float) ((Integer) animatedValue3).intValue();
                C107529g gVar2 = this.f321712d;
                RectF rectF3 = gVar2.f321720j;
                if (rectF3 == null) {
                    C87412m.m108603p("mMaskRect");
                    throw null;
                } else if (rectF3 != null) {
                    float f = rectF3.left;
                    Object animatedValue4 = valueAnimator.getAnimatedValue("scaleX");
                    C87412m.m108592e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                    rectF3.right = f + (((float) gVar2.f321725r) * ((Float) animatedValue4).floatValue());
                    C107529g gVar3 = this.f321712d;
                    RectF rectF4 = gVar3.f321720j;
                    if (rectF4 == null) {
                        C87412m.m108603p("mMaskRect");
                        throw null;
                    } else if (rectF4 != null) {
                        float f2 = rectF4.top;
                        Object animatedValue5 = valueAnimator.getAnimatedValue("scaleY");
                        C87412m.m108592e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                        rectF4.bottom = f2 + (((float) gVar3.f321726s) * ((Float) animatedValue5).floatValue());
                        C107529g gVar4 = this.f321712d;
                        Object animatedValue6 = valueAnimator.getAnimatedValue("bgAlpha");
                        C87412m.m108592e(animatedValue6, "null cannot be cast to non-null type kotlin.Int");
                        gVar4.f321729v = ((Integer) animatedValue6).intValue();
                        this.f321712d.postInvalidate();
                    } else {
                        C87412m.m108603p("mMaskRect");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mMaskRect");
                    throw null;
                }
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

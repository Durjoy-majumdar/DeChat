package po3;

import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import gy3.C59741c0;
import gy3.C87412m;

/* renamed from: po3.j */
public final class C110240j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ CropLayout f329762d;

    /* renamed from: e */
    public final /* synthetic */ boolean f329763e;

    /* renamed from: f */
    public final /* synthetic */ boolean f329764f;

    /* renamed from: g */
    public final /* synthetic */ C59741c0 f329765g;

    /* renamed from: h */
    public final /* synthetic */ C59741c0 f329766h;

    public C110240j(CropLayout cropLayout, boolean z, boolean z2, C59741c0 c0Var, C59741c0 c0Var2) {
        this.f329762d = cropLayout;
        this.f329763e = z;
        this.f329764f = z2;
        this.f329765g = c0Var;
        this.f329766h = c0Var2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if ((this.f329762d.getScaleType() == CropLayout.C97279e.CENTER_INSIDE && !this.f329763e && !this.f329764f) || (this.f329762d.getScaleType() == CropLayout.C97279e.CENTER_CROP && (!this.f329763e || !this.f329764f))) {
            Object animatedValue = valueAnimator.getAnimatedValue("scale");
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = (((Float) animatedValue).floatValue() * 1.0f) / this.f329762d.getContentViewScale()[0];
            CropLayout cropLayout = this.f329762d;
            cropLayout.mo154440H(floatValue, cropLayout.getContentRectF().centerX(), this.f329762d.getContentRectF().centerY());
        }
        Object animatedValue2 = valueAnimator.getAnimatedValue("transX");
        C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((Float) animatedValue2).floatValue();
        Object animatedValue3 = valueAnimator.getAnimatedValue("transY");
        C87412m.m108592e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((Float) animatedValue3).floatValue();
        Object animatedValue4 = valueAnimator.getAnimatedValue("edgeX");
        C87412m.m108592e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        float floatValue4 = ((Float) animatedValue4).floatValue();
        Object animatedValue5 = valueAnimator.getAnimatedValue("edgeY");
        C87412m.m108592e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
        float floatValue5 = ((Float) animatedValue5).floatValue();
        float f = floatValue4 - this.f329765g.f170634d;
        float f2 = floatValue5 - this.f329766h.f170634d;
        this.f329762d.mo154441I(this.f329764f ? -f : -(floatValue2 - this.f329762d.getContentRectF().centerX()), this.f329763e ? -f2 : -(floatValue3 - this.f329762d.getContentRectF().centerY()));
        this.f329765g.f170634d = floatValue4;
        this.f329766h.f170634d = floatValue5;
    }
}

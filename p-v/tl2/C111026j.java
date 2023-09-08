package tl2;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import gy3.C87412m;

/* renamed from: tl2.j */
public final class C111026j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsMaskView f332499d;

    public C111026j(ScanGoodsMaskView scanGoodsMaskView) {
        this.f332499d = scanGoodsMaskView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float f = ((float) 15) + (((float) -15) * floatValue);
        ImageView imageView = this.f332499d.f315930x;
        if (imageView != null) {
            imageView.setRotation(360.0f - Math.abs(f));
            ImageView imageView2 = this.f332499d.f315930x;
            if (imageView2 != null) {
                imageView2.setAlpha(floatValue);
                LinearLayout linearLayout = this.f332499d.f315905G;
                if (linearLayout != null) {
                    linearLayout.setAlpha(1.0f - floatValue);
                } else {
                    C87412m.m108603p("customTipsContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("successDecorationView");
                throw null;
            }
        } else {
            C87412m.m108603p("successDecorationView");
            throw null;
        }
    }
}

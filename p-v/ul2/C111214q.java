package ul2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductMaskDecorView;
import gy3.C87412m;

/* renamed from: ul2.q */
public final class C111214q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f333039d;

    /* renamed from: e */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333040e;

    public C111214q(boolean z, ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f333039d = z;
        this.f333040e = scanCodeProductMergeMaskView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f333039d) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ScanProductMaskDecorView scanProductMaskDecorView = this.f333040e.f316031W0;
            if (scanProductMaskDecorView != null) {
                scanProductMaskDecorView.setAlpha(1.0f - floatValue);
            } else {
                C87412m.m108603p("scanProductListView");
                throw null;
            }
        }
    }
}

package ul2;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82766t1;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ul2.l */
public final class C14245l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f39770d;

    /* renamed from: e */
    public final /* synthetic */ boolean f39771e;

    /* renamed from: f */
    public final /* synthetic */ boolean f39772f;

    public C14245l(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, boolean z, boolean z2) {
        this.f39770d = scanCodeProductMergeMaskView;
        this.f39771e = z;
        this.f39772f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f39770d.f316026R0;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.5f - (floatValue * 0.5f)));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$animateHideBlurView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$animateHideBlurView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                if (this.f39771e) {
                    ImageView imageView = this.f39770d.f316028T0;
                    if (imageView != null) {
                        imageView.setAlpha(1.0f - floatValue);
                    } else {
                        C87412m.m108603p(C82766t1.NAME);
                        throw null;
                    }
                }
                if (this.f39772f) {
                    ImageView imageView2 = this.f39770d.f316027S0;
                    if (imageView2 != null) {
                        imageView2.setAlpha(1.0f - floatValue);
                    } else {
                        C87412m.m108603p("bottomBlurView");
                        throw null;
                    }
                }
                Object[] objArr = new Object[2];
                View view2 = this.f39770d.f316026R0;
                if (view2 != null) {
                    objArr[0] = Float.valueOf(view2.getAlpha());
                    objArr[1] = Float.valueOf(floatValue);
                    Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo animateBlurView alpha: %s, factor: %f", objArr);
                    return;
                }
                C87412m.m108603p("maskView");
                throw null;
            }
            C87412m.m108603p("maskView");
            throw null;
        }
    }
}

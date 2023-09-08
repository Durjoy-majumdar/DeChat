package tl2;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82766t1;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: tl2.l */
public final class C111027l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsMaskView f332500d;

    /* renamed from: e */
    public final /* synthetic */ boolean f332501e;

    /* renamed from: f */
    public final /* synthetic */ boolean f332502f;

    public C111027l(ScanGoodsMaskView scanGoodsMaskView, boolean z, boolean z2) {
        this.f332500d = scanGoodsMaskView;
        this.f332501e = z;
        this.f332502f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f332500d.f315932y;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.5f - (floatValue * 0.5f)));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$animateHideBlurView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$animateHideBlurView$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                if (this.f332501e) {
                    ImageView imageView = this.f332500d.f315899A;
                    if (imageView != null) {
                        imageView.setAlpha(1.0f - floatValue);
                    } else {
                        C87412m.m108603p(C82766t1.NAME);
                        throw null;
                    }
                }
                if (this.f332502f) {
                    ImageView imageView2 = this.f332500d.f315934z;
                    if (imageView2 != null) {
                        imageView2.setAlpha(1.0f - floatValue);
                    } else {
                        C87412m.m108603p("bottomBlurView");
                        throw null;
                    }
                }
                ScanGoodsMaskView scanGoodsMaskView = this.f332500d;
                if (scanGoodsMaskView.f315902D) {
                    LinearLayout linearLayout = scanGoodsMaskView.f315905G;
                    if (linearLayout != null) {
                        linearLayout.setAlpha(floatValue);
                    } else {
                        C87412m.m108603p("customTipsContainer");
                        throw null;
                    }
                }
                Object[] objArr = new Object[2];
                View view2 = this.f332500d.f315932y;
                if (view2 != null) {
                    objArr[0] = Float.valueOf(view2.getAlpha());
                    objArr[1] = Float.valueOf(floatValue);
                    Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo animateBlurView alpha: %s, factor: %f", objArr);
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

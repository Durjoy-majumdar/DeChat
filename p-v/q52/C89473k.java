package q52;

import android.animation.ValueAnimator;
import android.webkit.WebView;
import gy3.C87412m;

/* renamed from: q52.k */
public final class C89473k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ WebView f257534d;

    /* renamed from: e */
    public final /* synthetic */ C89468h f257535e;

    public C89473k(WebView webView, C89468h hVar) {
        this.f257534d = webView;
        this.f257535e = hVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        if (((Float) animatedValue).floatValue() == 1.0f) {
            this.f257534d.setVisibility(8);
            return;
        }
        WebView webView = this.f257534d;
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        webView.setTranslationY(((Float) animatedValue2).floatValue() * this.f257535e.mo123776h());
        this.f257534d.requestLayout();
    }
}

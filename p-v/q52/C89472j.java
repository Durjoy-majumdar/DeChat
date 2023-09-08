package q52;

import android.animation.ValueAnimator;
import android.webkit.WebView;
import gy3.C87412m;

/* renamed from: q52.j */
public final class C89472j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ WebView f257532d;

    /* renamed from: e */
    public final /* synthetic */ C89468h f257533e;

    public C89472j(WebView webView, C89468h hVar) {
        this.f257532d = webView;
        this.f257533e = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        WebView webView = this.f257532d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        webView.setTranslationY(((Float) animatedValue).floatValue() * this.f257533e.mo123776h());
        this.f257532d.requestLayout();
    }
}

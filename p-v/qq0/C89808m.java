package qq0;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar;
import gy3.C87412m;

/* renamed from: qq0.m */
public final class C89808m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ BaseAppBrandSingleCloseCapsuleBar f258214d;

    /* renamed from: e */
    public final /* synthetic */ C89812q f258215e;

    public C89808m(BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar, C89812q qVar) {
        this.f258214d = baseAppBrandSingleCloseCapsuleBar;
        this.f258215e = qVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = (float) (((Integer) animatedValue).intValue() / 255);
        this.f258214d.mo116137e(intValue);
        C89812q qVar = this.f258215e;
        if (qVar != null) {
            qVar.mo117802a(intValue);
        }
    }
}

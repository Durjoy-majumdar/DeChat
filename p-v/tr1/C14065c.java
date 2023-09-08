package tr1;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: tr1.c */
public final class C14065c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f39456d;

    public C14065c(View view) {
        this.f39456d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue("scale");
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        Log.m105918d("LikeIconAnimationHelper", "valueScale=" + floatValue);
        this.f39456d.setScaleX(floatValue);
        this.f39456d.setScaleY(floatValue);
    }
}

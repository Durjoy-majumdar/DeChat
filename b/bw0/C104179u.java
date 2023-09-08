package bw0;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* renamed from: bw0.u */
public class C104179u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C104181w f308423d;

    public C104179u(C104181w wVar) {
        this.f308423d = wVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f308423d.f308431j = ((Integer) valueAnimator.getAnimatedValue("canvasTranslationX")).intValue();
        this.f308423d.f308430i.left = (float) ((Integer) valueAnimator.getAnimatedValue("translationX")).intValue();
        this.f308423d.f308430i.top = (float) ((Integer) valueAnimator.getAnimatedValue("translationY")).intValue();
        C104181w wVar = this.f308423d;
        RectF rectF = wVar.f308430i;
        rectF.right = rectF.left + (((float) wVar.f308435q) * ((Float) valueAnimator.getAnimatedValue("scaleX")).floatValue());
        C104181w wVar2 = this.f308423d;
        RectF rectF2 = wVar2.f308430i;
        rectF2.bottom = rectF2.top + (((float) wVar2.f308436r) * ((Float) valueAnimator.getAnimatedValue("scaleY")).floatValue());
        this.f308423d.f308439u = ((Integer) valueAnimator.getAnimatedValue("bgAlpha")).intValue();
        this.f308423d.postInvalidate();
    }
}

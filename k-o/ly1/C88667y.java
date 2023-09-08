package ly1;

import android.animation.ValueAnimator;

/* renamed from: ly1.y */
public class C88667y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C88668z f255985d;

    public C88667y(C88668z zVar) {
        this.f255985d = zVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f255985d.mo118898d((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

package bl0;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: bl0.d */
public class C67287d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f193119d;

    public C67287d(C67288e eVar, View view) {
        this.f193119d = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f193119d.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

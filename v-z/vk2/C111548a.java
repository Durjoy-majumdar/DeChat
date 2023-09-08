package vk2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;
import gy3.C87412m;

/* renamed from: vk2.a */
public final class C111548a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ BaseBoxDialogView f333969d;

    public C111548a(BaseBoxDialogView baseBoxDialogView) {
        this.f333969d = baseBoxDialogView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        BaseBoxDialogView baseBoxDialogView = this.f333969d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        baseBoxDialogView.setBackgroundTranslationY(((Float) animatedValue).floatValue());
    }
}

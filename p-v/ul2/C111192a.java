package ul2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.BaseScrollTabView;
import gy3.C87412m;

/* renamed from: ul2.a */
public final class C111192a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ float f333000d;

    /* renamed from: e */
    public final /* synthetic */ float f333001e;

    /* renamed from: f */
    public final /* synthetic */ BaseScrollTabView f333002f;

    public C111192a(float f, float f2, BaseScrollTabView baseScrollTabView) {
        this.f333000d = f;
        this.f333001e = f2;
        this.f333002f = baseScrollTabView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float f = this.f333000d;
        BaseScrollTabView baseScrollTabView = this.f333002f;
        baseScrollTabView.mo151700e(f + ((this.f333001e - f) * floatValue), baseScrollTabView.f315947D);
    }
}

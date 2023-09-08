package jt2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: jt2.f */
public class C99031f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ValueAnimator f290325d;

    /* renamed from: e */
    public final /* synthetic */ C99033h f290326e;

    public C99031f(C99033h hVar, ValueAnimator valueAnimator) {
        this.f290326e = hVar;
        this.f290325d = valueAnimator;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$2");
        if (this.f290326e.f290304d != null) {
            this.f290326e.f290304d.mo130378a(((Float) this.f290325d.getAnimatedValue()).floatValue());
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$2");
    }
}

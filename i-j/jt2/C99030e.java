package jt2;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: jt2.e */
public class C99030e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f290323d;

    /* renamed from: e */
    public final /* synthetic */ C99033h f290324e;

    public C99030e(C99033h hVar, View view) {
        this.f290324e = hVar;
        this.f290323d = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$1");
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C99033h hVar = this.f290324e;
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        hVar.f290329n = floatValue;
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        this.f290323d.invalidateOutline();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$1");
    }
}

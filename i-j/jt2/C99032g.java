package jt2;

import android.animation.Animator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: jt2.g */
public class C99032g implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C99033h f290327d;

    public C99032g(C99033h hVar) {
        this.f290327d = hVar;
    }

    public void onAnimationCancel(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$3");
        SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$3");
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$3");
        C99023b bVar = this.f290327d.f290304d;
        if (bVar != null) {
            bVar.onAnimationEnd();
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$3");
    }

    public void onAnimationRepeat(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$3");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$3");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$3");
        C99023b bVar = this.f290327d.f290304d;
        if (bVar != null) {
            bVar.onAnimationStart();
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$3");
    }
}

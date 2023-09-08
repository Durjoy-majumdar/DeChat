package lo2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: lo2.v0 */
public class C99571v0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C99574x0 f291867d;

    public C99571v0(C99574x0 x0Var) {
        this.f291867d = x0Var;
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$1");
        super.onAnimationStart(animator);
        C99574x0 x0Var = this.f291867d;
        x0Var.f291874f = true;
        if (C99574x0.m129968a(x0Var) != null) {
            C99574x0.m129968a(this.f291867d).mo130607b();
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$1");
    }
}

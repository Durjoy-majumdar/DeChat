package lo2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: lo2.w0 */
public class C99573w0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C99574x0 f291868d;

    public C99573w0(C99574x0 x0Var) {
        this.f291868d = x0Var;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$2");
        super.onAnimationEnd(animator);
        C99574x0 x0Var = this.f291868d;
        x0Var.f291874f = false;
        if (C99574x0.m129968a(x0Var) != null) {
            C99574x0.m129968a(this.f291868d).mo130606a();
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$2");
    }
}

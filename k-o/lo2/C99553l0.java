package lo2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: lo2.l0 */
public class C99553l0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C99557n0 f291830d;

    public C99553l0(C99557n0 n0Var) {
        this.f291830d = n0Var;
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper$1");
        super.onAnimationStart(animator);
        this.f291830d.f291838f = true;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper$1");
    }
}

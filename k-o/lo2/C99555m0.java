package lo2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: lo2.m0 */
public class C99555m0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C99557n0 f291832d;

    public C99555m0(C99557n0 n0Var) {
        this.f291832d = n0Var;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper$2");
        super.onAnimationEnd(animator);
        this.f291832d.f291838f = false;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper$2");
    }
}

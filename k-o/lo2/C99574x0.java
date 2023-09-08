package lo2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tenpay.tsm.TSMException;

/* renamed from: lo2.x0 */
public class C99574x0 {

    /* renamed from: a */
    public View f291869a;

    /* renamed from: b */
    public Object f291870b;

    /* renamed from: c */
    public AnimatorSet f291871c;

    /* renamed from: d */
    public AnimatorSet f291872d;

    /* renamed from: e */
    public boolean f291873e;

    /* renamed from: f */
    public boolean f291874f = false;

    /* renamed from: g */
    public Context f291875g;

    /* renamed from: h */
    public C99575a f291876h;

    /* renamed from: lo2.x0$a */
    public interface C99575a {
        /* renamed from: a */
        void mo130606a();

        /* renamed from: b */
        void mo130607b();
    }

    public C99574x0(View view, Object obj, Context context, boolean z, int i, int i2) {
        this.f291869a = view;
        this.f291870b = obj;
        this.f291875g = context;
        SnsMethodCalculate.markStartTimeMs("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        SnsMethodCalculate.markStartTimeMs("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(0);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, "rotationY", new float[]{180.0f, 0.0f});
        long j = (long) 1000;
        ofFloat2.setDuration(j);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{0.0f, 1.0f});
        ofFloat3.setDuration(0);
        long j2 = (long) 500;
        ofFloat3.setStartDelay(j2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        SnsMethodCalculate.markEndTimeMs("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        this.f291871c = animatorSet;
        SnsMethodCalculate.markStartTimeMs("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object) null, "rotationY", new float[]{0.0f, -180.0f});
        ofFloat4.setDuration(j);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{1.0f, 0.0f});
        ofFloat5.setDuration(0);
        ofFloat5.setStartDelay(j2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat4).with(ofFloat5);
        SnsMethodCalculate.markEndTimeMs("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        this.f291872d = animatorSet2;
        this.f291871c.addListener(new C99571v0(this));
        this.f291872d.addListener(new C99573w0(this));
        SnsMethodCalculate.markEndTimeMs("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        SnsMethodCalculate.markStartTimeMs("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        float f = this.f291869a.getContext().getResources().getDisplayMetrics().density * ((float) TSMException.ERR_JNIV2_BEGIN);
        this.f291869a.setCameraDistance(f);
        Object obj2 = this.f291870b;
        if (obj2 instanceof View) {
            ((View) obj2).setCameraDistance(f);
        }
        SnsMethodCalculate.markEndTimeMs("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
    }

    /* renamed from: a */
    public static /* synthetic */ C99575a m129968a(C99574x0 x0Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        C99575a aVar = x0Var.f291876h;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        return aVar;
    }

    /* renamed from: b */
    public void mo138942b() {
        SnsMethodCalculate.markStartTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        if (!this.f291874f) {
            SnsMethodCalculate.markStartTimeMs("flipCard", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
            if (!this.f291873e) {
                this.f291871c.setTarget(this.f291869a);
                this.f291872d.setTarget(this.f291870b);
                this.f291871c.start();
                this.f291872d.start();
                this.f291873e = true;
            } else {
                this.f291871c.setTarget(this.f291870b);
                this.f291872d.setTarget(this.f291869a);
                this.f291871c.start();
                this.f291872d.start();
                this.f291873e = false;
            }
            SnsMethodCalculate.markEndTimeMs("flipCard", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
        }
        SnsMethodCalculate.markEndTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
    }
}

package jt2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import kg3.C76577a;

/* renamed from: jt2.h */
public class C99033h extends C99022a {

    /* renamed from: m */
    public float f290328m;

    /* renamed from: n */
    public float f290329n;

    /* renamed from: o */
    public AnimatorSet f290330o;

    /* renamed from: p */
    public boolean f290331p;

    /* renamed from: q */
    public ViewOutlineProvider f290332q = new C99034a();

    /* renamed from: jt2.h$a */
    public class C99034a extends ViewOutlineProvider {
        public C99034a() {
        }

        public void getOutline(View view, Outline outline) {
            SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$4");
            int width = view.getWidth();
            int height = view.getHeight();
            C99033h hVar = C99033h.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
            float f = hVar.f290329n;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
            outline.setRoundRect(0, 0, width, height, f);
            SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$4");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99033h(Activity activity, View view, Bundle bundle, boolean z) {
        super(activity, view, false);
        float f;
        float f2;
        int i;
        mo138367a(bundle);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        float b = (float) C76577a.m92151b(this.f290301a, 8);
        this.f290328m = b;
        this.f290329n = b;
        this.f290331p = z;
        View view2 = this.f290302b;
        view2.setClipToOutline(true);
        view2.setOutlineProvider(this.f290332q);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
        long j = (long) 400;
        ofFloat.setDuration(j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "rotation", new float[]{(float) (this.f290331p ? -90 : 90), 0.0f});
        ofFloat2.setDuration(j);
        int i2 = this.f290312l;
        if (i2 == 0 || (i = this.f290311k) == 0) {
            f2 = 1.0f;
            f = 1.0f;
        } else {
            f2 = (((float) this.f290308h) * 1.0f) / ((float) i2);
            f = (((float) this.f290307g) * 1.0f) / ((float) i);
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{f2, 1.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{f, 1.0f});
        ofFloat3.setDuration(j);
        ofFloat4.setDuration(j);
        float f3 = ((float) this.f290305e) + (((float) this.f290307g) / 2.0f);
        float f4 = ((float) this.f290306f) + (((float) this.f290308h) / 2.0f);
        String str = APMidasPluginInfo.LAUNCH_INTERFACE_INIT;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{f3 - (((float) this.f290312l) / 2.0f), 0.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, "translationY", new float[]{f4 - (((float) this.f290311k) / 2.0f), 0.0f});
        ofFloat5.setDuration(j);
        ofFloat6.setDuration(j);
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(new float[]{this.f290328m, 0.0f});
        ofFloat7.setDuration(200);
        ofFloat7.setStartDelay(300);
        ofFloat7.addUpdateListener(new C99030e(this, view2));
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat8.setDuration(200);
        ofFloat8.setStartDelay(300);
        ofFloat8.addUpdateListener(new C99031f(this, ofFloat8));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f290330o = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8});
        this.f290330o.addListener(new C99032g(this));
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
    }

    /* renamed from: b */
    public void mo138368b(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        AnimatorSet animatorSet = this.f290330o;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f290330o.setStartDelay(j);
            this.f290330o.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
    }
}

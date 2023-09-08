package kt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import lt2.C99594b;
import nt2.C100165c;
import nt2.C100177j;

/* renamed from: kt2.f */
public class C99221f extends C99209b {

    /* renamed from: c */
    public C100177j f290935c;

    /* renamed from: d */
    public ValueAnimator f290936d;

    /* renamed from: e */
    public AnimatorSet f290937e;

    /* renamed from: kt2.f$a */
    public class C99222a implements ValueAnimator.AnimatorUpdateListener {
        public C99222a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 1.0f) {
                C99221f.m129231b(C99221f.this).f293493s.setScaleX(floatValue);
                C99221f.m129231b(C99221f.this).f293493s.setScaleY(floatValue);
                C99221f.m129231b(C99221f.this).f293493s.setAlpha(floatValue);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$1");
        }
    }

    /* renamed from: kt2.f$b */
    public class C99223b extends AnimatorListenerAdapter {
        public C99223b() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$2");
            Log.m105924i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation end");
            C99221f.m129231b(C99221f.this).f293493s.setScaleX(1.0f);
            C99221f.m129231b(C99221f.this).f293493s.setScaleY(1.0f);
            C99221f.m129231b(C99221f.this).f293493s.setAlpha(1.0f);
            C99594b.C99595a aVar = C99221f.this.f290919b;
            if (aVar != null) {
                aVar.onAnimationEnd();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$2");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$2");
            Log.m105924i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99221f.this.f290919b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$2");
        }
    }

    public C99221f(MMActivity mMActivity, C100165c cVar) {
        try {
            this.f290918a = mMActivity;
            this.f290935c = (C100177j) cVar;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            this.f290936d = ofFloat;
            ofFloat.addUpdateListener(new C99222a());
            this.f290936d.setDuration(400);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f290937e = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f290936d});
            this.f290937e.addListener(new C99223b());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SlideFullCardItemAdClickAnimation", "init exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C100177j m129231b(C99221f fVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        C100177j jVar = fVar.f290935c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        return jVar;
    }

    /* renamed from: a */
    public void mo138561a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
        AnimatorSet animatorSet = this.f290937e;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f290937e.setStartDelay(j);
            this.f290937e.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation");
    }
}

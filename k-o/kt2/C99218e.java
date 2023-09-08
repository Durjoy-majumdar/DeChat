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

/* renamed from: kt2.e */
public class C99218e extends C99208a {

    /* renamed from: c */
    public C100177j f290930c;

    /* renamed from: d */
    public ValueAnimator f290931d;

    /* renamed from: e */
    public AnimatorSet f290932e;

    /* renamed from: kt2.e$a */
    public class C99219a implements ValueAnimator.AnimatorUpdateListener {
        public C99219a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 0.0f) {
                C99218e.m129229b(C99218e.this).f293493s.setScaleX(floatValue);
                C99218e.m129229b(C99218e.this).f293493s.setScaleY(floatValue);
                C99218e.m129229b(C99218e.this).f293493s.setAlpha(floatValue);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$1");
        }
    }

    /* renamed from: kt2.e$b */
    public class C99220b extends AnimatorListenerAdapter {
        public C99220b() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
            Log.m105924i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation end");
            C99218e.m129229b(C99218e.this).f293493s.setScaleX(1.0f);
            C99218e.m129229b(C99218e.this).f293493s.setScaleY(1.0f);
            C99218e.m129229b(C99218e.this).f293493s.setAlpha(1.0f);
            C99594b.C99595a aVar = C99218e.this.f290917b;
            if (aVar != null) {
                aVar.onAnimationEnd();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
            Log.m105924i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99218e.this.f290917b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
        }
    }

    public C99218e(MMActivity mMActivity, C100165c cVar) {
        try {
            this.f290916a = mMActivity;
            this.f290930c = (C100177j) cVar;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f290931d = ofFloat;
            ofFloat.addUpdateListener(new C99219a());
            this.f290931d.setDuration(400);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f290932e = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f290931d});
            this.f290932e.addListener(new C99220b());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SlideFullCardItemAdBackAnimation", "init exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C100177j m129229b(C99218e eVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        C100177j jVar = eVar.f290930c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        return jVar;
    }

    /* renamed from: a */
    public void mo138560a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
        AnimatorSet animatorSet = this.f290932e;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f290932e.setStartDelay(j);
            this.f290932e.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation");
    }
}

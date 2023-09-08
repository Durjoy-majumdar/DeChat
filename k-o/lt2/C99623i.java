package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import lq2.C99578a;
import lt2.C99594b;

/* renamed from: lt2.i */
public class C99623i extends C99594b {

    /* renamed from: c */
    public C99578a.C99582d f292004c;

    /* renamed from: d */
    public ValueAnimator f292005d;

    /* renamed from: e */
    public AnimatorSet f292006e;

    /* renamed from: lt2.i$a */
    public class C99624a implements ValueAnimator.AnimatorUpdateListener {
        public C99624a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 1.0f) {
                C99623i.m130037b(C99623i.this).f291901H0.setScaleX(floatValue);
                C99623i.m130037b(C99623i.this).f291901H0.setScaleY(floatValue);
                C99623i.m130037b(C99623i.this).f291901H0.setAlpha(floatValue);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$1");
        }
    }

    /* renamed from: lt2.i$b */
    public class C99625b extends AnimatorListenerAdapter {
        public C99625b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$2");
            if (C99623i.m130037b(C99623i.this).f279985u0) {
                Log.m105924i("MicroMsg.SlideFullCardItemAdClickAnimation", "holder is busy");
                C99623i iVar = C99623i.this;
                iVar.getClass();
                SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
                AnimatorSet animatorSet = iVar.f292006e;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$2");
                return;
            }
            C99623i.m130037b(C99623i.this).f279985u0 = true;
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$2");
        }
    }

    /* renamed from: lt2.i$c */
    public class C99626c extends AnimatorListenerAdapter {
        public C99626c() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
            Log.m105924i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation end");
            C99623i.m130037b(C99623i.this).f291901H0.setScaleX(1.0f);
            C99623i.m130037b(C99623i.this).f291901H0.setScaleY(1.0f);
            C99623i.m130037b(C99623i.this).f291901H0.setAlpha(1.0f);
            C99594b.C99595a aVar = C99623i.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationEnd();
            }
            C99623i.m130037b(C99623i.this).f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
            Log.m105924i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99623i.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
        }
    }

    public C99623i(MMActivity mMActivity, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        try {
            this.f291960a = mMActivity;
            this.f292004c = (C99578a.C99582d) baseViewHolder;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            this.f292005d = ofFloat;
            ofFloat.addUpdateListener(new C99624a());
            this.f292005d.setDuration(400);
            this.f292005d.addListener(new C99625b());
            AnimatorSet animatorSet = new AnimatorSet();
            this.f292006e = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f292005d});
            this.f292006e.addListener(new C99626c());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SlideFullCardItemAdClickAnimation", "init exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C99578a.C99582d m130037b(C99623i iVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        C99578a.C99582d dVar = iVar.f292004c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        return dVar;
    }

    /* renamed from: a */
    public void mo138970a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
        AnimatorSet animatorSet = this.f292006e;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f292006e.setStartDelay(j);
            this.f292006e.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation");
    }
}

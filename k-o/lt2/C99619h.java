package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import lq2.C99578a;
import lt2.C99594b;

/* renamed from: lt2.h */
public class C99619h extends C99593a {

    /* renamed from: c */
    public C99578a.C99582d f291998c;

    /* renamed from: d */
    public ValueAnimator f291999d;

    /* renamed from: e */
    public AnimatorSet f292000e;

    /* renamed from: lt2.h$a */
    public class C99620a implements ValueAnimator.AnimatorUpdateListener {
        public C99620a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 0.0f) {
                C99619h.m130035b(C99619h.this).f291901H0.setScaleX(floatValue);
                C99619h.m130035b(C99619h.this).f291901H0.setScaleY(floatValue);
                C99619h.m130035b(C99619h.this).f291901H0.setAlpha(floatValue);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$1");
        }
    }

    /* renamed from: lt2.h$b */
    public class C99621b extends AnimatorListenerAdapter {
        public C99621b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
            if (C99619h.m130035b(C99619h.this).f279985u0) {
                Log.m105924i("MicroMsg.SlideFullCardItemAdBackAnimation", "holder is busy");
                C99619h hVar = C99619h.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
                AnimatorSet animatorSet = hVar.f292000e;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
                Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
                return;
            }
            C99619h.m130035b(C99619h.this).f279985u0 = true;
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$2");
        }
    }

    /* renamed from: lt2.h$c */
    public class C99622c extends AnimatorListenerAdapter {
        public C99622c() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$3");
            Log.m105924i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation end");
            C99619h.m130035b(C99619h.this).f291901H0.setScaleX(1.0f);
            C99619h.m130035b(C99619h.this).f291901H0.setScaleY(1.0f);
            C99619h.m130035b(C99619h.this).f291901H0.setAlpha(1.0f);
            C99594b.C99595a aVar = C99619h.this.f291959b;
            if (aVar != null) {
                aVar.onAnimationEnd();
            }
            C99619h.m130035b(C99619h.this).f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$3");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$3");
            Log.m105924i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99619h.this.f291959b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation$3");
        }
    }

    public C99619h(MMActivity mMActivity, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        try {
            this.f291958a = mMActivity;
            this.f291998c = (C99578a.C99582d) baseViewHolder;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f291999d = ofFloat;
            ofFloat.addUpdateListener(new C99620a());
            this.f291999d.setDuration(400);
            this.f291999d.addListener(new C99621b());
            AnimatorSet animatorSet = new AnimatorSet();
            this.f292000e = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f291999d});
            this.f292000e.addListener(new C99622c());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SlideFullCardItemAdBackAnimation", "init exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C99578a.C99582d m130035b(C99619h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        C99578a.C99582d dVar = hVar.f291998c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        return dVar;
    }

    /* renamed from: a */
    public void mo138969a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
        AnimatorSet animatorSet = this.f292000e;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f292000e.setStartDelay(j);
            this.f292000e.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdBackAnimation");
    }
}

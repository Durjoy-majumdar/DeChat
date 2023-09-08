package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95911b;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import lt2.C99594b;

/* renamed from: lt2.c */
public class C99596c extends C99593a {

    /* renamed from: c */
    public C95911b.C95915d f291962c;

    /* renamed from: d */
    public AnimatorSet f291963d;

    /* renamed from: lt2.c$a */
    public class C99597a implements ValueAnimator.AnimatorUpdateListener {
        public C99597a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 0.0f) {
                C99596c.m130027b(C99596c.this).f280035G0.setScaleX(floatValue);
                C99596c.m130027b(C99596c.this).f280035G0.setScaleY(floatValue);
                C99596c.m130027b(C99596c.this).f280035G0.setAlpha(floatValue);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$1");
        }
    }

    /* renamed from: lt2.c$b */
    public class C99598b extends AnimatorListenerAdapter {
        public C99598b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$2");
            if (C99596c.m130027b(C99596c.this).f279985u0) {
                Log.m105924i("MicroMsg.CardAdBackAnimation", "holder is busy");
                C99596c cVar = C99596c.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
                AnimatorSet animatorSet = cVar.f291963d;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
                Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$2");
                return;
            }
            C99596c.m130027b(C99596c.this).f279985u0 = true;
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$2");
        }
    }

    /* renamed from: lt2.c$c */
    public class C99599c implements ValueAnimator.AnimatorUpdateListener {
        public C99599c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$3");
            C99596c.m130027b(C99596c.this).f280036H0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$3");
        }
    }

    /* renamed from: lt2.c$d */
    public class C99600d extends AnimatorListenerAdapter {
        public C99600d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
            Log.m105924i("MicroMsg.CardAdBackAnimation", "onAnimation end");
            C99596c.m130027b(C99596c.this).f280035G0.setScaleX(1.0f);
            C99596c.m130027b(C99596c.this).f280035G0.setScaleY(1.0f);
            C99596c.m130027b(C99596c.this).f280035G0.setAlpha(1.0f);
            C99596c.m130027b(C99596c.this).f280036H0.setAlpha(1.0f);
            C99594b.C99595a aVar = C99596c.this.f291959b;
            if (aVar != null) {
                aVar.onAnimationEnd();
            }
            C99596c.m130027b(C99596c.this).f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
            Log.m105924i("MicroMsg.CardAdBackAnimation", "onAnimation start");
            C99596c.m130027b(C99596c.this).f280036H0.setAlpha(0.0f);
            C99594b.C99595a aVar = C99596c.this.f291959b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
        }
    }

    public C99596c(MMActivity mMActivity, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f291958a = mMActivity;
        this.f291962c = (C95911b.C95915d) baseViewHolder;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C99597a());
        ofFloat.setDuration(400);
        ofFloat.addListener(new C99598b());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.addUpdateListener(new C99599c());
        ofFloat2.setDuration(100);
        ofFloat2.setStartDelay(300);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f291963d = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f291963d.addListener(new C99600d());
    }

    /* renamed from: b */
    public static /* synthetic */ C95911b.C95915d m130027b(C99596c cVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
        C95911b.C95915d dVar = cVar.f291962c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
        return dVar;
    }

    /* renamed from: a */
    public void mo138969a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
        if (!this.f291963d.isStarted()) {
            this.f291963d.setStartDelay(j);
            this.f291963d.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation");
    }
}

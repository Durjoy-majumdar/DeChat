package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95911b;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import lt2.C99594b;
import rq2.C101432s;

/* renamed from: lt2.d */
public class C99601d extends C99594b {

    /* renamed from: c */
    public C95911b.C95915d f291968c;

    /* renamed from: d */
    public AnimatorSet f291969d;

    /* renamed from: lt2.d$a */
    public class C99602a implements ValueAnimator.AnimatorUpdateListener {
        public C99602a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 1.0f) {
                C99601d.m130029b(C99601d.this).f280035G0.setScaleX(floatValue);
                C99601d.m130029b(C99601d.this).f280035G0.setScaleY(floatValue);
                C99601d.m130029b(C99601d.this).f280035G0.setAlpha(floatValue);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$1");
        }
    }

    /* renamed from: lt2.d$b */
    public class C99603b extends AnimatorListenerAdapter {
        public C99603b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
            if (C99601d.m130029b(C99601d.this).f279985u0) {
                Log.m105924i("MicroMsg.CardAdClickAnimation", "holder is busy");
                C99601d dVar = C99601d.this;
                dVar.getClass();
                SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
                dVar.f291969d.end();
                SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
                return;
            }
            C99601d.m130029b(C99601d.this).f279985u0 = true;
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
        }
    }

    /* renamed from: lt2.d$c */
    public class C99604c implements ValueAnimator.AnimatorUpdateListener {
        public C99604c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$3");
            C99601d.m130029b(C99601d.this).f280036H0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$3");
        }
    }

    /* renamed from: lt2.d$d */
    public class C99605d extends AnimatorListenerAdapter {
        public C99605d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
            Log.m105924i("MicroMsg.CardAdClickAnimation", "onAnimation end");
            C99601d.m130029b(C99601d.this).f280035G0.setScaleX(1.0f);
            C99601d.m130029b(C99601d.this).f280035G0.setScaleY(1.0f);
            C99601d.m130029b(C99601d.this).f280035G0.setAlpha(1.0f);
            C99601d.m130029b(C99601d.this).f280036H0.setAlpha(1.0f);
            if (C99601d.m130029b(C99601d.this).f280054Z0 && C101432s.m133123e(C99601d.m130029b(C99601d.this).f280053Y0)) {
                View childAt = C99601d.m130029b(C99601d.this).f280053Y0.getChildAt(0);
                if (childAt instanceof OnlineVideoView) {
                    ((OnlineVideoView) childAt).mo132322N(0, false);
                }
            }
            C99594b.C99595a aVar = C99601d.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationEnd();
            }
            C99601d.m130029b(C99601d.this).f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
            Log.m105924i("MicroMsg.CardAdClickAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99601d.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
        }
    }

    public C99601d(MMActivity mMActivity, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f291960a = mMActivity;
        this.f291968c = (C95911b.C95915d) baseViewHolder;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.addUpdateListener(new C99602a());
        ofFloat.setDuration(400);
        ofFloat.addListener(new C99603b());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.addUpdateListener(new C99604c());
        ofFloat2.setDuration(100);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f291969d = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f291969d.addListener(new C99605d());
    }

    /* renamed from: b */
    public static /* synthetic */ C95911b.C95915d m130029b(C99601d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        C95911b.C95915d dVar2 = dVar.f291968c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        return dVar2;
    }

    /* renamed from: a */
    public void mo138970a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        if (!this.f291969d.isStarted()) {
            this.f291969d.setStartDelay(j);
            this.f291969d.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
    }
}

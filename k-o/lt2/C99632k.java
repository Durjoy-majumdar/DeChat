package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95933n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;

/* renamed from: lt2.k */
public class C99632k extends C99594b {

    /* renamed from: c */
    public C95933n.C95941e f292018c;

    /* renamed from: d */
    public ValueAnimator f292019d;

    /* renamed from: e */
    public ValueAnimator f292020e;

    /* renamed from: f */
    public AnimatorSet f292021f;

    /* renamed from: lt2.k$a */
    public class C99633a implements ValueAnimator.AnimatorUpdateListener {
        public C99633a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 1.0f) {
                C99632k.m130041b(C99632k.this).f280127H0.setScaleX(floatValue);
                C99632k.m130041b(C99632k.this).f280127H0.setScaleY(floatValue);
                View view = C99632k.m130041b(C99632k.this).f280127H0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$1");
        }
    }

    /* renamed from: lt2.k$b */
    public class C99634b extends AnimatorListenerAdapter {
        public C99634b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
            if (C99632k.m130041b(C99632k.this).f279985u0) {
                Log.m105924i("MicroMsg.SphereCardAdClickAnimation", "holder is busy");
                C99632k kVar = C99632k.this;
                kVar.getClass();
                SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
                AnimatorSet animatorSet = kVar.f292021f;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
                return;
            }
            C99632k.m130041b(C99632k.this).f279985u0 = true;
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
        }
    }

    /* renamed from: lt2.k$c */
    public class C99635c implements ValueAnimator.AnimatorUpdateListener {
        public C99635c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99632k.m130041b(C99632k.this).f280125F0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99632k.m130041b(C99632k.this).f280126G0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$3");
        }
    }

    /* renamed from: lt2.k$d */
    public class C99636d extends AnimatorListenerAdapter {
        public C99636d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$4");
            Log.m105924i("MicroMsg.SphereCardAdClickAnimation", "onAnimation end");
            View view = C99632k.m130041b(C99632k.this).f280127H0;
            Float valueOf = Float.valueOf(1.0f);
            view.setScaleX(1.0f);
            C99632k.m130041b(C99632k.this).f280127H0.setScaleY(1.0f);
            View view2 = C99632k.m130041b(C99632k.this).f280127H0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = C99632k.m130041b(C99632k.this).f280125F0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = C99632k.m130041b(C99632k.this).f280126G0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99632k.this.f291961b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            C99632k.m130041b(C99632k.this).f280128I0.mo176088k();
            C99632k.m130041b(C99632k.this).f280128I0.mo176044d();
            C99632k.m130041b(C99632k.this).f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$4");
            Log.m105924i("MicroMsg.SphereCardAdClickAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99632k.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$4");
        }
    }

    public C99632k(MMActivity mMActivity, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        try {
            this.f291960a = mMActivity;
            this.f292018c = (C95933n.C95941e) baseViewHolder;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            this.f292019d = ofFloat;
            ofFloat.addUpdateListener(new C99633a());
            this.f292019d.setDuration(400);
            this.f292019d.addListener(new C99634b());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            this.f292020e = ofFloat2;
            ofFloat2.addUpdateListener(new C99635c());
            this.f292020e.setDuration(100);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f292021f = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f292019d, this.f292020e});
            this.f292021f.addListener(new C99636d());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SphereCardAdClickAnimation", "init exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C95933n.C95941e m130041b(C99632k kVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        C95933n.C95941e eVar = kVar.f292018c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        return eVar;
    }

    /* renamed from: a */
    public void mo138970a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        AnimatorSet animatorSet = this.f292021f;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f292021f.setStartDelay(j);
            this.f292021f.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
    }
}

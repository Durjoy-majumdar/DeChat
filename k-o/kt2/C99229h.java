package kt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;
import nt2.C100165c;
import nt2.C100180k;

/* renamed from: kt2.h */
public class C99229h extends C99209b {

    /* renamed from: c */
    public C100180k f290948c;

    /* renamed from: d */
    public ValueAnimator f290949d;

    /* renamed from: e */
    public ValueAnimator f290950e;

    /* renamed from: f */
    public AnimatorSet f290951f;

    /* renamed from: kt2.h$a */
    public class C99230a implements ValueAnimator.AnimatorUpdateListener {
        public C99230a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 1.0f) {
                C99229h.m129235b(C99229h.this).f293519y.setScaleX(floatValue);
                C99229h.m129235b(C99229h.this).f293519y.setScaleY(floatValue);
                View view = C99229h.m129235b(C99229h.this).f293519y;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$1");
        }
    }

    /* renamed from: kt2.h$b */
    public class C99231b extends AnimatorListenerAdapter {
        public C99231b(C99229h hVar) {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$2");
        }
    }

    /* renamed from: kt2.h$c */
    public class C99232c implements ValueAnimator.AnimatorUpdateListener {
        public C99232c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99229h.m129235b(C99229h.this).f293510p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99229h.m129235b(C99229h.this).f293511q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$3");
        }
    }

    /* renamed from: kt2.h$d */
    public class C99233d extends AnimatorListenerAdapter {
        public C99233d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$4");
            Log.m105924i("MicroMsg.SphereCardAdDetailClickAnimation", "onAnimation end");
            View view = C99229h.m129235b(C99229h.this).f293519y;
            Float valueOf = Float.valueOf(1.0f);
            view.setScaleX(1.0f);
            C99229h.m129235b(C99229h.this).f293519y.setScaleY(1.0f);
            View view2 = C99229h.m129235b(C99229h.this).f293519y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = C99229h.m129235b(C99229h.this).f293510p;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = C99229h.m129235b(C99229h.this).f293511q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99229h.this.f290919b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            C99229h.m129235b(C99229h.this).f293517w.mo176088k();
            C99229h.m129235b(C99229h.this).f293517w.mo176044d();
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$4");
            Log.m105924i("MicroMsg.SphereCardAdDetailClickAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99229h.this.f290919b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$4");
        }
    }

    public C99229h(MMActivity mMActivity, C100165c cVar) {
        try {
            this.f290918a = mMActivity;
            this.f290948c = (C100180k) cVar;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            this.f290949d = ofFloat;
            ofFloat.addUpdateListener(new C99230a());
            this.f290949d.setDuration(400);
            this.f290949d.addListener(new C99231b(this));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            this.f290950e = ofFloat2;
            ofFloat2.addUpdateListener(new C99232c());
            this.f290950e.setDuration(100);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f290951f = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f290949d, this.f290950e});
            this.f290951f.addListener(new C99233d());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SphereCardAdDetailClickAnimation", "init exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C100180k m129235b(C99229h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        C100180k kVar = hVar.f290948c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        return kVar;
    }

    /* renamed from: a */
    public void mo138561a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
        AnimatorSet animatorSet = this.f290951f;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f290951f.setStartDelay(j);
            this.f290951f.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation");
    }
}

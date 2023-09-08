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

/* renamed from: kt2.g */
public class C99224g extends C99208a {

    /* renamed from: c */
    public C100180k f290940c;

    /* renamed from: d */
    public ValueAnimator f290941d;

    /* renamed from: e */
    public ValueAnimator f290942e;

    /* renamed from: f */
    public AnimatorSet f290943f;

    /* renamed from: kt2.g$a */
    public class C99225a implements ValueAnimator.AnimatorUpdateListener {
        public C99225a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 0.0f) {
                C99224g.m129233b(C99224g.this).f293519y.setScaleX(floatValue);
                C99224g.m129233b(C99224g.this).f293519y.setScaleY(floatValue);
                View view = C99224g.m129233b(C99224g.this).f293519y;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$1");
        }
    }

    /* renamed from: kt2.g$b */
    public class C99226b extends AnimatorListenerAdapter {
        public C99226b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$2");
            View view = C99224g.m129233b(C99224g.this).f293510p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99224g.m129233b(C99224g.this).f293511q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$2");
        }
    }

    /* renamed from: kt2.g$c */
    public class C99227c implements ValueAnimator.AnimatorUpdateListener {
        public C99227c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99224g.m129233b(C99224g.this).f293510p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99224g.m129233b(C99224g.this).f293511q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$3");
        }
    }

    /* renamed from: kt2.g$d */
    public class C99228d extends AnimatorListenerAdapter {
        public C99228d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$4");
            Log.m105924i("MicroMsg.SphereCardAdDetailBackAnimation", "onAnimation end");
            View view = C99224g.m129233b(C99224g.this).f293519y;
            Float valueOf = Float.valueOf(1.0f);
            view.setScaleX(1.0f);
            C99224g.m129233b(C99224g.this).f293519y.setScaleY(1.0f);
            View view2 = C99224g.m129233b(C99224g.this).f293519y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = C99224g.m129233b(C99224g.this).f293510p;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = C99224g.m129233b(C99224g.this).f293511q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99224g.this.f290917b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$4");
            Log.m105924i("MicroMsg.SphereCardAdDetailBackAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99224g.this.f290917b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation$4");
        }
    }

    public C99224g(MMActivity mMActivity, C100165c cVar) {
        try {
            this.f290916a = mMActivity;
            this.f290940c = (C100180k) cVar;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f290941d = ofFloat;
            ofFloat.addUpdateListener(new C99225a());
            this.f290941d.setDuration(400);
            this.f290941d.addListener(new C99226b());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f290942e = ofFloat2;
            ofFloat2.addUpdateListener(new C99227c());
            this.f290942e.setDuration(100);
            this.f290942e.setStartDelay(300);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f290943f = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f290941d, this.f290942e});
            this.f290943f.addListener(new C99228d());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SphereCardAdDetailBackAnimation", "init exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C100180k m129233b(C99224g gVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        C100180k kVar = gVar.f290940c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        return kVar;
    }

    /* renamed from: a */
    public void mo138560a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
        AnimatorSet animatorSet = this.f290943f;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f290943f.setStartDelay(j);
            this.f290943f.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailBackAnimation");
    }
}

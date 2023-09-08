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
import nt2.C100167e;

/* renamed from: kt2.c */
public class C99210c extends C99208a {

    /* renamed from: c */
    public C100167e f290920c;

    /* renamed from: d */
    public AnimatorSet f290921d;

    /* renamed from: kt2.c$a */
    public class C99211a implements ValueAnimator.AnimatorUpdateListener {
        public C99211a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 0.0f) {
                C99210c.m129225b(C99210c.this).f293456z.setScaleX(floatValue);
                C99210c.m129225b(C99210c.this).f293456z.setScaleY(floatValue);
                View view = C99210c.m129225b(C99210c.this).f293456z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$1");
        }
    }

    /* renamed from: kt2.c$b */
    public class C99212b implements ValueAnimator.AnimatorUpdateListener {
        public C99212b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$2");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99210c.m129225b(C99210c.this).f293420A;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$2");
        }
    }

    /* renamed from: kt2.c$c */
    public class C99213c extends AnimatorListenerAdapter {
        public C99213c() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$3");
            Log.m105924i("MicroMsg.CardAdDetailBackAnimation", "onAnimation end");
            View view = C99210c.m129225b(C99210c.this).f293456z;
            Float valueOf = Float.valueOf(1.0f);
            view.setScaleX(1.0f);
            C99210c.m129225b(C99210c.this).f293456z.setScaleY(1.0f);
            View view2 = C99210c.m129225b(C99210c.this).f293456z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = C99210c.m129225b(C99210c.this).f293420A;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar3 = C99210c.this.f290917b;
            if (aVar3 != null) {
                aVar3.onAnimationEnd();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$3");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$3");
            Log.m105924i("MicroMsg.CardAdDetailBackAnimation", "onAnimation start");
            View view = C99210c.m129225b(C99210c.this).f293420A;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$3", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$3", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar2 = C99210c.this.f290917b;
            if (aVar2 != null) {
                aVar2.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$3");
        }
    }

    public C99210c(MMActivity mMActivity, C100165c cVar) {
        this.f290916a = mMActivity;
        this.f290920c = (C100167e) cVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C99211a());
        ofFloat.setDuration(400);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.addUpdateListener(new C99212b());
        ofFloat2.setDuration(100);
        ofFloat2.setStartDelay(300);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f290921d = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f290921d.addListener(new C99213c());
    }

    /* renamed from: b */
    public static /* synthetic */ C100167e m129225b(C99210c cVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        C100167e eVar = cVar.f290920c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        return eVar;
    }

    /* renamed from: a */
    public void mo138560a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
        if (!this.f290921d.isStarted()) {
            this.f290921d.setStartDelay(j);
            this.f290921d.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation");
    }
}

package kt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;
import nt2.C100165c;
import nt2.C100167e;
import rq2.C101432s;

/* renamed from: kt2.d */
public class C99214d extends C99209b {

    /* renamed from: c */
    public C100167e f290925c;

    /* renamed from: d */
    public AnimatorSet f290926d;

    /* renamed from: kt2.d$a */
    public class C99215a implements ValueAnimator.AnimatorUpdateListener {
        public C99215a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 1.0f) {
                C99214d.m129227b(C99214d.this).f293456z.setScaleX(floatValue);
                C99214d.m129227b(C99214d.this).f293456z.setScaleY(floatValue);
                View view = C99214d.m129227b(C99214d.this).f293456z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$1");
        }
    }

    /* renamed from: kt2.d$b */
    public class C99216b implements ValueAnimator.AnimatorUpdateListener {
        public C99216b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$2");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99214d.m129227b(C99214d.this).f293420A;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$2");
        }
    }

    /* renamed from: kt2.d$c */
    public class C99217c extends AnimatorListenerAdapter {
        public C99217c() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$3");
            Log.m105924i("MicroMsg.CardAdDetailClickAnimation", "onAnimation end");
            View view = C99214d.m129227b(C99214d.this).f293456z;
            Float valueOf = Float.valueOf(1.0f);
            view.setScaleX(1.0f);
            C99214d.m129227b(C99214d.this).f293456z.setScaleY(1.0f);
            View view2 = C99214d.m129227b(C99214d.this).f293456z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = C99214d.m129227b(C99214d.this).f293420A;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (C99214d.m129227b(C99214d.this).f293439U && C101432s.m133123e(C99214d.m129227b(C99214d.this).f293437S)) {
                View childAt = C99214d.m129227b(C99214d.this).f293437S.getChildAt(0);
                if (childAt instanceof OnlineVideoView) {
                    ((OnlineVideoView) childAt).mo132322N(0, false);
                }
            }
            C99594b.C99595a aVar3 = C99214d.this.f290919b;
            if (aVar3 != null) {
                aVar3.onAnimationEnd();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$3");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$3");
            Log.m105924i("MicroMsg.CardAdDetailClickAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99214d.this.f290919b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$3");
        }
    }

    public C99214d(MMActivity mMActivity, C100165c cVar) {
        this.f290918a = this.f290918a;
        this.f290925c = (C100167e) cVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.addUpdateListener(new C99215a());
        ofFloat.setDuration(400);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.addUpdateListener(new C99216b());
        ofFloat2.setDuration(100);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f290926d = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f290926d.addListener(new C99217c());
    }

    /* renamed from: b */
    public static /* synthetic */ C100167e m129227b(C99214d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation");
        C100167e eVar = dVar.f290925c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation");
        return eVar;
    }

    /* renamed from: a */
    public void mo138561a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation");
        if (!this.f290926d.isStarted()) {
            this.f290926d.setStartDelay(j);
            this.f290926d.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation");
    }
}

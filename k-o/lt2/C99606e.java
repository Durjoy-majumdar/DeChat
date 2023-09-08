package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;
import nq2.C100151a;

/* renamed from: lt2.e */
public class C99606e extends C99593a {

    /* renamed from: c */
    public ValueAnimator f291974c;

    /* renamed from: d */
    public ValueAnimator f291975d;

    /* renamed from: e */
    public AnimatorSet f291976e;

    /* renamed from: lt2.e$a */
    public class C99607a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291977d;

        public C99607a(C99606e eVar, C100151a.C100155d dVar) {
            this.f291977d = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 0.0f) {
                this.f291977d.f293379x.setScaleX(floatValue);
                this.f291977d.f293379x.setScaleY(floatValue);
                View view = this.f291977d.f293379x;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$1");
        }
    }

    /* renamed from: lt2.e$b */
    public class C99608b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291978d;

        public C99608b(C100151a.C100155d dVar) {
            this.f291978d = dVar;
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$2");
            if (this.f291978d.f293355K.f293343d) {
                Log.m105924i("MicroMsg.FullCardAnim.back", "holder is busy");
                C99606e eVar = C99606e.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew");
                AnimatorSet animatorSet = eVar.f291976e;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew");
                Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$2");
                return;
            }
            this.f291978d.f293355K.f293343d = true;
            View view = this.f291978d.f293356a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f291978d.f293357b;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$2");
        }
    }

    /* renamed from: lt2.e$c */
    public class C99609c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291980d;

        public C99609c(C99606e eVar, C100151a.C100155d dVar) {
            this.f291980d = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.f291980d.f293356a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f291980d.f293357b;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$3");
        }
    }

    /* renamed from: lt2.e$d */
    public class C99610d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291981d;

        public C99610d(C100151a.C100155d dVar) {
            this.f291981d = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$4");
            Log.m105924i("MicroMsg.FullCardAnim.back", "onAnimation end");
            View view = this.f291981d.f293379x;
            Float valueOf = Float.valueOf(1.0f);
            view.setScaleX(1.0f);
            this.f291981d.f293379x.setScaleY(1.0f);
            View view2 = this.f291981d.f293379x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = this.f291981d.f293356a;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = this.f291981d.f293357b;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdBackAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99606e.this.f291959b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            this.f291981d.f293355K.f293343d = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$4");
            Log.m105924i("MicroMsg.FullCardAnim.back", "onAnimation start");
            C99594b.C99595a aVar = C99606e.this.f291959b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew$4");
        }
    }

    public C99606e(MMActivity mMActivity, C100151a.C100155d dVar) {
        try {
            Log.m105918d("MicroMsg.FullCardAnim.back", "new FullCardAdBackAnimationNew, source=" + dVar.f293355K.f293340a + ", hash=" + hashCode());
            this.f291958a = mMActivity;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f291974c = ofFloat;
            ofFloat.addUpdateListener(new C99607a(this, dVar));
            this.f291974c.setDuration(400);
            this.f291974c.addListener(new C99608b(dVar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f291975d = ofFloat2;
            ofFloat2.addUpdateListener(new C99609c(this, dVar));
            this.f291975d.setDuration(100);
            this.f291975d.setStartDelay(300);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f291976e = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f291974c, this.f291975d});
            this.f291976e.addListener(new C99610d(dVar));
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.FullCardAnim.back", "init exp=" + th.toString());
        }
    }

    /* renamed from: a */
    public void mo138969a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew");
        Log.m105918d("MicroMsg.FullCardAnim.back", "startAnimation, hash=" + hashCode());
        AnimatorSet animatorSet = this.f291976e;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f291976e.setStartDelay(j);
            this.f291976e.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdBackAnimationNew");
    }
}

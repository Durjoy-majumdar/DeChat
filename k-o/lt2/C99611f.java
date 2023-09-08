package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTimelineVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;
import nq2.C100151a;
import nu2.C100207g;
import p329d3.C86165a;

/* renamed from: lt2.f */
public class C99611f extends C99594b {

    /* renamed from: c */
    public ValueAnimator f291983c;

    /* renamed from: d */
    public ValueAnimator f291984d;

    /* renamed from: e */
    public AnimatorSet f291985e;

    /* renamed from: lt2.f$a */
    public class C99612a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291986d;

        public C99612a(C99611f fVar, C100151a.C100155d dVar) {
            this.f291986d = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 1.0f) {
                this.f291986d.f293379x.setScaleX(floatValue);
                this.f291986d.f293379x.setScaleY(floatValue);
                View view = this.f291986d.f293379x;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$1");
        }
    }

    /* renamed from: lt2.f$b */
    public class C99613b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291987d;

        public C99613b(C100151a.C100155d dVar) {
            this.f291987d = dVar;
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
            if (this.f291987d.f293355K.f293343d) {
                Log.m105924i("MicroMsg.FullCardAnim.click", "holder is busy");
                C99611f fVar = C99611f.this;
                fVar.getClass();
                SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
                Log.m105918d("MicroMsg.FullCardAnim.click", "endAnimation, hash=" + fVar.hashCode());
                AnimatorSet animatorSet = fVar.f291985e;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
                return;
            }
            this.f291987d.f293355K.f293343d = true;
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
        }
    }

    /* renamed from: lt2.f$c */
    public class C99614c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291989d;

        public C99614c(C99611f fVar, C100151a.C100155d dVar) {
            this.f291989d = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.f291989d.f293356a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f291989d.f293357b;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$3");
        }
    }

    /* renamed from: lt2.f$d */
    public class C99615d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291990d;

        public C99615d(C100151a.C100155d dVar) {
            this.f291990d = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
            Log.m105924i("MicroMsg.FullCardAnim.click", "onAnimation end");
            View view = this.f291990d.f293379x;
            Float valueOf = Float.valueOf(1.0f);
            view.setScaleX(1.0f);
            this.f291990d.f293379x.setScaleY(1.0f);
            View view2 = this.f291990d.f293379x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = this.f291990d.f293356a;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = this.f291990d.f293357b;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99611f.this.f291961b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            this.f291990d.f293355K.f293343d = false;
            C100151a.C100155d dVar = this.f291990d;
            if (dVar.f293355K.f293342c) {
                SnsTimelineVideoView snsTimelineVideoView = dVar.f293376u;
                if (snsTimelineVideoView != null) {
                    snsTimelineVideoView.mo132322N(0, false);
                }
            } else if (dVar.f293368m.f280504g.getVisibility() == 0) {
                SnsAdTimelineVideoView snsAdTimelineVideoView = this.f291990d.f293368m.f280504g;
                snsAdTimelineVideoView.getClass();
                SnsMethodCalculate.markStartTimeMs("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                C86165a<Boolean> aVar5 = snsAdTimelineVideoView.f281514A;
                if (aVar5 != null) {
                    aVar5.accept(Boolean.TRUE);
                }
                snsAdTimelineVideoView.mo132294l(0, false);
                SnsMethodCalculate.markEndTimeMs("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                Log.m105924i("MicroMsg.FullCardAnim.click", "seek newVideoView to 0");
            }
            C100207g gVar = this.f291990d.f293355K.f293344e;
            if (gVar != null) {
                gVar.mo139492f();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
            Log.m105924i("MicroMsg.FullCardAnim.click", "onAnimation start");
            C99594b.C99595a aVar = C99611f.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
        }
    }

    public C99611f(MMActivity mMActivity, C100151a.C100155d dVar) {
        try {
            Log.m105918d("MicroMsg.FullCardAnim.click", "new FullCardAdClickAnimationNew, source=" + dVar.f293355K.f293340a + ", hash=" + hashCode());
            this.f291960a = mMActivity;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            this.f291983c = ofFloat;
            ofFloat.addUpdateListener(new C99612a(this, dVar));
            this.f291983c.setDuration(400);
            this.f291983c.addListener(new C99613b(dVar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            this.f291984d = ofFloat2;
            ofFloat2.addUpdateListener(new C99614c(this, dVar));
            this.f291984d.setDuration(100);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f291985e = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f291983c, this.f291984d});
            this.f291985e.addListener(new C99615d(dVar));
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.FullCardAnim.click", "init exp=" + th.toString());
        }
    }

    /* renamed from: a */
    public void mo138970a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
        Log.m105918d("MicroMsg.FullCardAnim.click", "startAnimation, hash=" + hashCode());
        AnimatorSet animatorSet = this.f291985e;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f291985e.setStartDelay(j);
            this.f291985e.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
    }
}

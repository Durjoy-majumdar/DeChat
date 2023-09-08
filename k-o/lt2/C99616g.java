package lt2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;
import nq2.C100151a;
import nu2.C100207g;
import nu2.C100214l;

/* renamed from: lt2.g */
public class C99616g extends C99594b {

    /* renamed from: c */
    public AnimatorSet f291992c;

    /* renamed from: d */
    public boolean f291993d;

    /* renamed from: e */
    public C100151a.C100155d f291994e;

    /* renamed from: lt2.g$a */
    public class C99617a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291995d;

        public C99617a(C99616g gVar, C100151a.C100155d dVar) {
            this.f291995d = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.f291995d.f293356a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f291995d.f293357b;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$1");
        }
    }

    /* renamed from: lt2.g$b */
    public class C99618b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C100151a.C100155d f291996d;

        public C99618b(C100151a.C100155d dVar) {
            this.f291996d = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$2");
            C99616g.this.mo138991b();
            C99594b.C99595a aVar = C99616g.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationEnd();
            }
            this.f291996d.f293355K.f293343d = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$2");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$2");
            C99594b.C99595a aVar = C99616g.this.f291961b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$2");
        }
    }

    public C99616g(MMActivity mMActivity, C100151a.C100155d dVar, boolean z) {
        String str;
        float f;
        float f2;
        C100151a.C100155d dVar2 = dVar;
        try {
            Log.m105918d("MicroMsg.FullCardAnim.simple_twist", "new FullCardAdSimpleTwistClickAnimationNew, source=" + dVar2.f293355K.f293340a + ", hash=" + hashCode());
            this.f291993d = z;
            this.f291960a = mMActivity;
            this.f291994e = dVar2;
            View view = dVar2.f293379x;
            int height = view.getHeight();
            int width = view.getWidth();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(400);
            int[] b = C95198o2.m121130b(this.f291960a);
            int i3 = b[0];
            int i4 = b[1];
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, (float) (this.f291993d ? 90 : -90)});
            ofFloat2.setDuration(400);
            if (height != 0) {
                f = 1.0f;
                f2 = (((float) i3) * 1.0f) / ((float) height);
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            str = "MicroMsg.FullCardAnim.simple_twist";
            try {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f, f2});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f, f2});
                ofFloat3.setDuration(400);
                ofFloat4.setDuration(400);
                float f3 = ((float) i) + (((float) width) / 2.0f);
                float f4 = ((float) i2) + (((float) height) / 2.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, (((float) i3) / 2.0f) - f3});
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (((float) i4) / 2.0f) - f4});
                ofFloat5.setDuration(400);
                ofFloat6.setDuration(400);
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat7.addUpdateListener(new C99617a(this, dVar2));
                ofFloat7.setDuration(100);
                AnimatorSet animatorSet = new AnimatorSet();
                this.f291992c = animatorSet;
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7});
                this.f291992c.addListener(new C99618b(dVar2));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            str = "MicroMsg.FullCardAnim.simple_twist";
            Log.m105920e(str, "init exp=" + th.toString());
            mo138991b();
        }
    }

    /* renamed from: a */
    public void mo138970a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
        Log.m105918d("MicroMsg.FullCardAnim.simple_twist", "startAnimation, hash=" + hashCode());
        AnimatorSet animatorSet = this.f291992c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f291992c.setStartDelay(j);
            this.f291992c.start();
            C100207g gVar = this.f291994e.f293355K.f293344e;
            if (gVar instanceof C100214l) {
                C100214l lVar = (C100214l) gVar;
                lVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                TwistCoverView twistCoverView = lVar.f293629k;
                SnsMethodCalculate.markEndTimeMs("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                if (twistCoverView != null && twistCoverView.getVisibility() == 0) {
                    twistCoverView.setAlpha(0.0f);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
    }

    /* renamed from: b */
    public void mo138991b() {
        SnsMethodCalculate.markStartTimeMs("resetViewStatus", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
        Log.m105924i("MicroMsg.FullCardAnim.simple_twist", "resetViewStatus");
        try {
            this.f291994e.f293379x.setScaleX(1.0f);
            this.f291994e.f293379x.setScaleY(1.0f);
            View view = this.f291994e.f293379x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f291994e.f293379x.setRotation(0.0f);
            this.f291994e.f293379x.setTranslationX(0.0f);
            this.f291994e.f293379x.setTranslationY(0.0f);
            View view2 = this.f291994e.f293356a;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view3 = this.f291994e.f293357b;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C100207g gVar = this.f291994e.f293355K.f293344e;
            if (gVar instanceof C100214l) {
                C100214l lVar = (C100214l) gVar;
                lVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                TwistCoverView twistCoverView = lVar.f293629k;
                SnsMethodCalculate.markEndTimeMs("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                if (twistCoverView != null) {
                    twistCoverView.setAlpha(1.0f);
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.FullCardAnim.simple_twist", "resetViewStatus exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("resetViewStatus", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
    }
}

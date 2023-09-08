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
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import lt2.C99594b;

/* renamed from: lt2.j */
public class C99627j extends C99593a {

    /* renamed from: c */
    public C95933n.C95941e f292010c;

    /* renamed from: d */
    public ValueAnimator f292011d;

    /* renamed from: e */
    public ValueAnimator f292012e;

    /* renamed from: f */
    public AnimatorSet f292013f;

    /* renamed from: lt2.j$a */
    public class C99628a implements ValueAnimator.AnimatorUpdateListener {
        public C99628a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (floatValue != 0.0f) {
                C99627j.m130039b(C99627j.this).f280127H0.setScaleX(floatValue);
                C99627j.m130039b(C99627j.this).f280127H0.setScaleY(floatValue);
                View view = C99627j.m130039b(C99627j.this).f280127H0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$1");
        }
    }

    /* renamed from: lt2.j$b */
    public class C99629b extends AnimatorListenerAdapter {
        public C99629b() {
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$2");
            if (C99627j.m130039b(C99627j.this).f279985u0) {
                Log.m105924i("MicroMsg.SphereCardAdBackAnimation", "holder is busy");
                C99627j jVar = C99627j.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
                AnimatorSet animatorSet = jVar.f292013f;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
                Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$2");
                return;
            }
            C99627j.m130039b(C99627j.this).f279985u0 = true;
            View view = C99627j.m130039b(C99627j.this).f280125F0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99627j.m130039b(C99627j.this).f280126G0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$2");
        }
    }

    /* renamed from: lt2.j$c */
    public class C99630c implements ValueAnimator.AnimatorUpdateListener {
        public C99630c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$3");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C99627j.m130039b(C99627j.this).f280125F0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C99627j.m130039b(C99627j.this).f280126G0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$3");
        }
    }

    /* renamed from: lt2.j$d */
    public class C99631d extends AnimatorListenerAdapter {
        public C99631d() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$4");
            Log.m105924i("MicroMsg.SphereCardAdBackAnimation", "onAnimation end");
            View view = C99627j.m130039b(C99627j.this).f280127H0;
            Float valueOf = Float.valueOf(1.0f);
            view.setScaleX(1.0f);
            C99627j.m130039b(C99627j.this).f280127H0.setScaleY(1.0f);
            View view2 = C99627j.m130039b(C99627j.this).f280127H0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(valueOf);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = C99627j.m130039b(C99627j.this).f280125F0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = C99627j.m130039b(C99627j.this).f280126G0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(valueOf);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/animation/timeline/SphereCardAdBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C99594b.C99595a aVar4 = C99627j.this.f291959b;
            if (aVar4 != null) {
                aVar4.onAnimationEnd();
            }
            C99627j.m130039b(C99627j.this).f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$4");
            Log.m105924i("MicroMsg.SphereCardAdBackAnimation", "onAnimation start");
            C99594b.C99595a aVar = C99627j.this.f291959b;
            if (aVar != null) {
                aVar.onAnimationStart();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation$4");
        }
    }

    public C99627j(MMActivity mMActivity, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        try {
            this.f291958a = mMActivity;
            this.f292010c = (C95933n.C95941e) baseViewHolder;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f292011d = ofFloat;
            ofFloat.addUpdateListener(new C99628a());
            this.f292011d.setDuration(400);
            this.f292011d.addListener(new C99629b());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f292012e = ofFloat2;
            ofFloat2.addUpdateListener(new C99630c());
            this.f292012e.setDuration(100);
            this.f292012e.setStartDelay(300);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f292013f = animatorSet;
            animatorSet.playTogether(new Animator[]{this.f292011d, this.f292012e});
            this.f292013f.addListener(new C99631d());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SphereCardAdBackAnimation", "init exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C95933n.C95941e m130039b(C99627j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        C95933n.C95941e eVar = jVar.f292010c;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        return eVar;
    }

    /* renamed from: a */
    public void mo138969a(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
        AnimatorSet animatorSet = this.f292013f;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f292013f.setStartDelay(j);
            this.f292013f.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdBackAnimation");
    }
}

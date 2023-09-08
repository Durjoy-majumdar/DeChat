package tr1;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: tr1.f */
public final class C14068f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f39461d;

    /* renamed from: e */
    public final /* synthetic */ long f39462e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f39463f;

    /* renamed from: tr1.f$a */
    public static final class C14069a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f39464d;

        public C14069a(View view) {
            this.f39464d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue("alpha");
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f39464d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startOnlyAlpha$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startOnlyAlpha$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: tr1.f$b */
    public static final class C14070b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f39465d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f39466e;

        /* renamed from: tr1.f$b$a */
        public static final class C14071a implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ View f39467d;

            /* renamed from: e */
            public final /* synthetic */ C32224a<C13598b0> f39468e;

            public C14071a(View view, C32224a<C13598b0> aVar) {
                this.f39467d = view;
                this.f39468e = aVar;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                View view = this.f39467d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startOnlyAlpha$1$2$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startOnlyAlpha$1$2$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view2 = this.f39467d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startOnlyAlpha$1$2$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startOnlyAlpha$1$2$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C32224a<C13598b0> aVar3 = this.f39468e;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        public C14070b(View view, C32224a<C13598b0> aVar) {
            this.f39465d = view;
            this.f39466e = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f39465d.animate().alpha(0.0f).setStartDelay(300).setListener(new C14071a(this.f39465d, this.f39466e)).start();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C14068f(View view, long j, C32224a<C13598b0> aVar) {
        this.f39461d = view;
        this.f39462e = j;
        this.f39463f = aVar;
    }

    public final void run() {
        View view = this.f39461d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startOnlyAlpha$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startOnlyAlpha$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f})});
        ofPropertyValuesHolder.setDuration(this.f39462e).addUpdateListener(new C14069a(this.f39461d));
        ofPropertyValuesHolder.addListener(new C14070b(this.f39461d, this.f39463f));
        ofPropertyValuesHolder.start();
    }
}

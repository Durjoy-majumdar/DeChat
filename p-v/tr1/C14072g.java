package tr1;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: tr1.g */
public final class C14072g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MotionEvent f39469d;

    /* renamed from: e */
    public final /* synthetic */ View f39470e;

    /* renamed from: f */
    public final /* synthetic */ float f39471f;

    /* renamed from: g */
    public final /* synthetic */ long f39472g;

    /* renamed from: h */
    public final /* synthetic */ float f39473h;

    /* renamed from: i */
    public final /* synthetic */ C32224a<C13598b0> f39474i;

    /* renamed from: j */
    public final /* synthetic */ boolean f39475j;

    /* renamed from: tr1.g$a */
    public static final class C14073a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f39476d;

        public C14073a(View view) {
            this.f39476d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue("scale");
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Object animatedValue2 = valueAnimator.getAnimatedValue("alpha");
            C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            float floatValue2 = ((Float) animatedValue2).floatValue();
            this.f39476d.setScaleX(floatValue);
            this.f39476d.setScaleY(floatValue);
            View view = this.f39476d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue2));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startWithAlpha$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startWithAlpha$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: tr1.g$b */
    public static final class C14074b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f39477d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f39478e;

        /* renamed from: f */
        public final /* synthetic */ boolean f39479f;

        /* renamed from: tr1.g$b$a */
        public static final class C14075a implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ View f39480d;

            /* renamed from: e */
            public final /* synthetic */ C32224a<C13598b0> f39481e;

            /* renamed from: f */
            public final /* synthetic */ boolean f39482f;

            /* renamed from: tr1.g$b$a$a */
            public static final class C14076a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ View f39483d;

                public C14076a(View view) {
                    this.f39483d = view;
                }

                public final void run() {
                    ViewParent parent = this.f39483d.getParent();
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(this.f39483d);
                }
            }

            public C14075a(View view, C32224a<C13598b0> aVar, boolean z) {
                this.f39480d = view;
                this.f39481e = aVar;
                this.f39482f = z;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                this.f39480d.setScaleX(1.0f);
                this.f39480d.setScaleY(1.0f);
                View view = this.f39480d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startWithAlpha$1$3$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startWithAlpha$1$3$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                this.f39480d.setTranslationX(0.0f);
                this.f39480d.setTranslationY(0.0f);
                View view2 = this.f39480d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startWithAlpha$1$3$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startWithAlpha$1$3$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C32224a<C13598b0> aVar3 = this.f39481e;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                if (this.f39482f) {
                    View view4 = this.f39480d;
                    view4.post(new C14076a(view4));
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        public C14074b(View view, C32224a<C13598b0> aVar, boolean z) {
            this.f39477d = view;
            this.f39478e = aVar;
            this.f39479f = z;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f39477d.animate().alpha(0.0f).setStartDelay(300).setListener(new C14075a(this.f39477d, this.f39478e, this.f39479f)).start();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C14072g(MotionEvent motionEvent, View view, float f, long j, float f2, C32224a<C13598b0> aVar, boolean z) {
        this.f39469d = motionEvent;
        this.f39470e = view;
        this.f39471f = f;
        this.f39472g = j;
        this.f39473h = f2;
        this.f39474i = aVar;
        this.f39475j = z;
    }

    public final void run() {
        MotionEvent motionEvent = this.f39469d;
        if (motionEvent != null) {
            View view = this.f39470e;
            float f = this.f39473h;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            int[] iArr = C14063b.f39454b;
            view.getLocationInWindow(iArr);
            view.setTranslationX((motionEvent.getRawX() - ((float) iArr[0])) - ((float) (view.getWidth() / 2)));
            view.setTranslationY(((motionEvent.getRawY() - ((float) iArr[1])) - ((float) (view.getHeight() / 2))) + f);
        }
        View view2 = this.f39470e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startWithAlpha$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$startWithAlpha$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f2 = this.f39471f;
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{0.5f * f2, 1.75f * f2, 1.25f * f2, f2 * 1.5f}), PropertyValuesHolder.ofFloat("alpha", new float[]{0.7f, 0.5f, 0.8f, 1.0f})});
        ofPropertyValuesHolder.setDuration(this.f39472g).addUpdateListener(new C14073a(this.f39470e));
        ofPropertyValuesHolder.addListener(new C14074b(this.f39470e, this.f39474i, this.f39475j));
        ofPropertyValuesHolder.start();
    }
}

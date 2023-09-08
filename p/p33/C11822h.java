package p33;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: p33.h */
public final class C11822h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110152e f34574d;

    /* renamed from: e */
    public final /* synthetic */ View f34575e;

    /* renamed from: p33.h$a */
    public static final class C11823a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C110152e f34576d;

        public C11823a(C110152e eVar) {
            this.f34576d = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f34576d.f329509e;
            if (view != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$showFinishCard$3$2$alphaAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$showFinishCard$3$2$alphaAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* renamed from: p33.h$b */
    public static final class C11824b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f34577d;

        /* renamed from: e */
        public final /* synthetic */ C110152e f34578e;

        public C11824b(View view, C110152e eVar) {
            this.f34577d = view;
            this.f34578e = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f34577d.getLayoutParams();
            WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                C110152e eVar = this.f34578e;
                View view = this.f34577d;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.y = ((Integer) animatedValue).intValue();
                ViewManager viewManager = eVar.f329508d;
                if (viewManager != null) {
                    viewManager.updateViewLayout(view, layoutParams2);
                }
            }
        }
    }

    /* renamed from: p33.h$c */
    public static final class C11825c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ View f34579d;

        /* renamed from: e */
        public final /* synthetic */ C110152e f34580e;

        public C11825c(View view, C110152e eVar) {
            this.f34579d = view;
            this.f34580e = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            Context context;
            super.onAnimationEnd(animator);
            C110152e eVar = this.f34580e;
            eVar.f329506b = true;
            String str = null;
            eVar.f329514j = null;
            View view = eVar.f329521q;
            if (view != null) {
                if (!(view == null || (context = view.getContext()) == null)) {
                    str = context.getString(C0966R.string.n6_);
                }
                view.setContentDescription(str);
            }
            View view2 = this.f34580e.f329521q;
            if (view2 != null) {
                view2.sendAccessibilityEvent(128);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            View view = this.f34579d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$showFinishCard$3$2$positionAnimator$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$showFinishCard$3$2$positionAnimator$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C11822h(C110152e eVar, View view) {
        this.f34574d = eVar;
        this.f34575e = view;
    }

    public final void run() {
        this.f34574d.f329517m = this.f34575e.getMeasuredHeight();
        Animator animator = this.f34574d.f329514j;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{-this.f34574d.f329517m, 0});
        C110152e eVar = this.f34574d;
        View view = this.f34575e;
        View view2 = eVar.f329509e;
        if (view2 != null) {
            ofInt.addUpdateListener(new C11824b(view2, eVar));
        }
        ofInt.addListener(new C11825c(view, eVar));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C110152e eVar2 = this.f34574d;
        if (eVar2.f329509e != null) {
            ofFloat.addUpdateListener(new C11823a(eVar2));
        }
        C110152e eVar3 = this.f34574d;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).with(ofFloat);
        animatorSet.setDuration(300);
        animatorSet.start();
        eVar3.f329514j = animatorSet;
    }
}

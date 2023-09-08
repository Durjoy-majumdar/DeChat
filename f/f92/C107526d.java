package f92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: f92.d */
public final class C107526d {

    /* renamed from: a */
    public View f321709a;

    /* renamed from: b */
    public Animator f321710b;

    /* renamed from: c */
    public Animator f321711c;

    /* renamed from: f92.d$a */
    public static final class C75730a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final View f222328d;

        /* renamed from: e */
        public final AnimatorListenerAdapter f222329e;

        public C75730a(View view, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f222328d = view;
            this.f222329e = animatorListenerAdapter;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationCancel(animator);
            View view = this.f222328d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler$HideAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler$HideAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f222329e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationEnd(animator);
            View view = this.f222328d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler$HideAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler$HideAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f222328d.setTranslationX(0.0f);
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f222329e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
        }

        public void onAnimationPause(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationPause(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f222329e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationPause(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationRepeat(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f222329e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationRepeat(animator);
            }
        }

        public void onAnimationResume(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationResume(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f222329e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationResume(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationStart(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f222329e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: f92.d$b */
    public static final class C75731b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final View f222330d;

        /* renamed from: e */
        public final AnimatorListenerAdapter f222331e;

        public C75731b(View view, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f222330d = view;
            this.f222331e = animatorListenerAdapter;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationCancel(animator);
            View view = this.f222330d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f222331e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationEnd(animator);
            View view = this.f222330d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f222331e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
        }

        public void onAnimationPause(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationPause(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f222331e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationPause(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationRepeat(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f222331e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationRepeat(animator);
            }
        }

        public void onAnimationResume(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationResume(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f222331e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationResume(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animation");
            super.onAnimationStart(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f222331e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    public C107526d(View view) {
        this.f321709a = view;
    }

    /* renamed from: a */
    public final Animator mo157964a(int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f321709a, "translationX", new float[]{0.0f, -((float) i)});
        C87412m.m108593f(ofFloat, "ofFloat(targetView, \"tra…, 0.0f, -width.toFloat())");
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        animatorSet.playTogether(new Animator[]{ofFloat});
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        return animatorSet;
    }

    /* renamed from: b */
    public final Animator mo157965b(boolean z, int i, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        ObjectAnimator objectAnimator;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            if (z2) {
                objectAnimator = ObjectAnimator.ofFloat(this.f321709a, "translationX", new float[]{-((float) i), 0.0f});
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.f321709a, "translationX", new float[]{(float) i, 0.0f});
            }
        } else if (z2) {
            objectAnimator = ObjectAnimator.ofFloat(this.f321709a, "translationX", new float[]{0.0f, -((float) i)});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f321709a, "translationX", new float[]{0.0f, (float) i});
        }
        objectAnimator.setDuration(800);
        animatorSet.playTogether(new Animator[]{objectAnimator});
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        return animatorSet;
    }

    /* renamed from: c */
    public final void mo157966c(int i, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.f321709a != null) {
            Animator animator = this.f321711c;
            if (animator != null ? animator.isRunning() : false) {
                Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingHide");
                if (animatorListenerAdapter != null) {
                    animatorListenerAdapter.onAnimationCancel((Animator) null);
                    return;
                }
                return;
            }
            Animator animator2 = this.f321710b;
            if (animator2 != null ? animator2.isRunning() : false) {
                Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "cancel show animator");
                if (animatorListenerAdapter != null) {
                    animatorListenerAdapter.onAnimationCancel((Animator) null);
                }
                Animator animator3 = this.f321710b;
                if (animator3 != null) {
                    animator3.cancel();
                }
            }
            if (z) {
                this.f321711c = mo157964a(i, new C75730a(this.f321709a, animatorListenerAdapter));
            } else if (z2) {
                C75730a aVar = new C75730a(this.f321709a, animatorListenerAdapter);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f321709a, "alpha", new float[]{1.0f, 0.0f});
                C87412m.m108593f(ofFloat, "ofFloat(targetView, \"alpha\", 1.0f, 0.0f)");
                ofFloat.setDuration(500);
                ofFloat.setInterpolator(new AccelerateInterpolator());
                animatorSet.playTogether(new Animator[]{ofFloat});
                animatorSet.addListener(aVar);
                this.f321711c = animatorSet;
            } else {
                this.f321711c = mo157964a(i, new C75730a(this.f321709a, animatorListenerAdapter));
            }
            Animator animator4 = this.f321711c;
            if (animator4 != null) {
                animator4.start();
            }
        } else if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel((Animator) null);
        }
    }
}

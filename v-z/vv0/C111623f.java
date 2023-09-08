package vv0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Iterator;
import java.util.Vector;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vv0.f */
public class C111623f {

    /* renamed from: a */
    public View f334148a;

    /* renamed from: b */
    public Animator f334149b;

    /* renamed from: c */
    public Animator f334150c;

    /* renamed from: d */
    public Vector<Runnable> f334151d = new Vector<>();

    /* renamed from: vv0.f$a */
    public class C78484a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public View f229915d;

        /* renamed from: e */
        public AnimatorListenerAdapter f229916e;

        public C78484a(View view, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f229915d = view;
            this.f229916e = animatorListenerAdapter;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            View view = this.f229915d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$HideAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$HideAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f229916e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel(animator);
            }
            C111623f.this.mo163292b();
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f229915d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$HideAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$HideAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f229916e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
            C111623f.this.mo163292b();
        }

        public void onAnimationPause(Animator animator) {
            super.onAnimationPause(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229916e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationPause(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229916e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationRepeat(animator);
            }
        }

        public void onAnimationResume(Animator animator) {
            super.onAnimationResume(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229916e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationResume(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229916e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: vv0.f$b */
    public class C78485b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public View f229918d;

        /* renamed from: e */
        public AnimatorListenerAdapter f229919e;

        public C78485b(View view, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f229918d = view;
            this.f229919e = animatorListenerAdapter;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            View view = this.f229918d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f229919e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationCancel(animator);
            }
            C111623f.this.mo163292b();
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f229918d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler$ShowAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AnimatorListenerAdapter animatorListenerAdapter = this.f229919e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animator);
            }
            C111623f.this.mo163292b();
        }

        public void onAnimationPause(Animator animator) {
            super.onAnimationPause(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229919e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationPause(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229919e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationRepeat(animator);
            }
        }

        public void onAnimationResume(Animator animator) {
            super.onAnimationResume(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229919e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationResume(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AnimatorListenerAdapter animatorListenerAdapter = this.f229919e;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animator);
            }
        }
    }

    public C111623f(View view) {
        this.f334148a = view;
    }

    /* renamed from: a */
    public Animator mo163291a(boolean z, int i, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        ObjectAnimator objectAnimator;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            if (z2) {
                objectAnimator = ObjectAnimator.ofFloat(this.f334148a, "translationX", new float[]{(float) (-i), 0.0f});
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.f334148a, "translationX", new float[]{(float) i, 0.0f});
            }
        } else if (z2) {
            objectAnimator = ObjectAnimator.ofFloat(this.f334148a, "translationX", new float[]{0.0f, (float) (-i)});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f334148a, "translationX", new float[]{0.0f, (float) i});
        }
        objectAnimator.setDuration(300);
        animatorSet.playTogether(new Animator[]{objectAnimator});
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        return animatorSet;
    }

    /* renamed from: b */
    public void mo163292b() {
        if (!this.f334151d.isEmpty()) {
            Log.m105925i("MicroMsg.FloatBallViewAnimationHandler", "firePendingTasks, size:%s", Integer.valueOf(this.f334151d.size()));
            Iterator<Runnable> it = this.f334151d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.f334151d.clear();
        }
    }

    /* renamed from: c */
    public boolean mo163293c() {
        Animator animator = this.f334150c;
        return animator != null && animator.isRunning();
    }

    /* renamed from: d */
    public boolean mo163294d() {
        Animator animator = this.f334149b;
        return animator != null && animator.isRunning();
    }
}

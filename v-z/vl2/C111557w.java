package vl2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vl2.w */
public final class C111557w {

    /* renamed from: vl2.w$a */
    public static final class C111558a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ Animator.AnimatorListener f333973d;

        /* renamed from: e */
        public final /* synthetic */ View f333974e;

        /* renamed from: f */
        public final /* synthetic */ boolean f333975f;

        public C111558a(Animator.AnimatorListener animatorListener, View view, boolean z) {
            this.f333973d = animatorListener;
            this.f333974e = view;
            this.f333975f = z;
        }

        public void onAnimationCancel(Animator animator) {
            C87412m.m108594g(animator, "animation");
            Animator.AnimatorListener animatorListener = this.f333973d;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            View view = this.f333974e;
            int i = this.f333975f ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/util/ScanViewUtils$animateAlpha$listener$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/util/ScanViewUtils$animateAlpha$listener$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Animator.AnimatorListener animatorListener = this.f333973d;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            C87412m.m108594g(animator, "animation");
            Animator.AnimatorListener animatorListener = this.f333973d;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            C87412m.m108594g(animator, "animation");
            Animator.AnimatorListener animatorListener = this.f333973d;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: a */
    public static final void m152065a(View view, float f, float f2, long j, Animator.AnimatorListener animatorListener) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator listener2;
        ViewPropertyAnimator updateListener;
        Log.m105927v("MicroMsg.ScanViewUtils", "alvinluo animateAlpha view: %s, fromAlpha: %s, targetAlpha: %s", view, Float.valueOf(f), Float.valueOf(f2));
        if (!(view == null || (animate2 = view.animate()) == null || (listener2 = animate2.setListener((Animator.AnimatorListener) null)) == null || (updateListener = listener2.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null)) == null)) {
            updateListener.cancel();
        }
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/util/ScanViewUtils", "animateAlpha", "(Landroid/view/View;FFJLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/util/ScanViewUtils", "animateAlpha", "(Landroid/view/View;FFJLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(f2)) != null && (duration = alpha.setDuration(j)) != null && (interpolator = duration.setInterpolator(new LinearInterpolator())) != null && (listener = interpolator.setListener(animatorListener)) != null) {
            listener.start();
        }
    }

    /* renamed from: b */
    public static final void m152066b(View view, boolean z, Animator.AnimatorListener animatorListener) {
        View view2 = view;
        boolean z2 = z;
        if (view2 != null) {
            if (z2) {
                if (!(view.getAlpha() == 0.0f)) {
                    Log.m105929w("MicroMsg.ScanViewUtils", "alvinluo animateAlpha show ignore, view: %s", view2);
                    return;
                }
            }
            if (!z2) {
                if (!(view.getAlpha() == 1.0f)) {
                    Log.m105929w("MicroMsg.ScanViewUtils", "alvinluo animateAlpha hide ignore, view: %s", view2);
                    return;
                }
            }
            Log.m105927v("MicroMsg.ScanViewUtils", "alvinluo animateAlpha show: %b, view: %s", Boolean.valueOf(z), view2);
            C111558a aVar = new C111558a(animatorListener, view, z2);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/util/ScanViewUtils", "animateAlpha", "(Landroid/view/View;ZLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/util/ScanViewUtils", "animateAlpha", "(Landroid/view/View;ZLandroid/animation/Animator$AnimatorListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m152065a(view, z2 ? 0.0f : 1.0f, z2 ? 1.0f : 0.0f, 200, aVar);
        }
    }

    /* renamed from: c */
    public static final PointF m152067c(View view, float f, float f2) {
        PointF pointF = new PointF(f, f2);
        if (view instanceof C19706a) {
            return ((C19706a) view).mo26070h(pointF);
        }
        return null;
    }
}

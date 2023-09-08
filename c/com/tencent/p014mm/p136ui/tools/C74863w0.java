package com.tencent.p014mm.p136ui.tools;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.ui.tools.w0 */
public class C74863w0 {

    /* renamed from: com.tencent.mm.ui.tools.w0$a */
    public class C74864a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C74865b f220112d;

        public C74864a(C74865b bVar) {
            this.f220112d = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f220112d.mo26404a();
        }

        public void onAnimationEnd(Animator animator) {
            this.f220112d.onAnimationEnd();
        }

        public void onAnimationRepeat(Animator animator) {
            this.f220112d.mo26405b();
        }

        public void onAnimationStart(Animator animator) {
            this.f220112d.onAnimationStart();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.w0$b */
    public interface C74865b {
        /* renamed from: a */
        void mo26404a();

        /* renamed from: b */
        void mo26405b();

        void onAnimationEnd();

        void onAnimationStart();
    }

    /* renamed from: a */
    public static final void m89620a(View view, long j, float f, float f2, C74865b bVar) {
        if (view != null && !C11171e.m11044a(14)) {
            Animator animator = (Animator) view.getTag(C0966R.C0970id.i8d);
            if (animator != null) {
                animator.cancel();
            }
            Log.m105925i("Changelcai", "[animTran] duration:%s x:%s", Long.valueOf(j), Float.valueOf(f));
            view.animate().cancel();
            view.animate().setListener((Animator.AnimatorListener) null);
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(view.getContext(), C0966R.C0968anim.f2435cy);
            if (bVar == null) {
                view.animate().setDuration(j).translationX(f).translationY(f2).setInterpolator(loadInterpolator);
            } else {
                view.animate().setDuration(j).translationX(f).translationY(f2).setInterpolator(loadInterpolator).setListener(new C74864a(bVar));
            }
        }
    }

    /* renamed from: b */
    public static void m89621b(View view, Animator.AnimatorListener animatorListener) {
        if (view != null && !C11171e.m11044a(11)) {
            Animator animator = (Animator) view.getTag(C0966R.C0970id.i8d);
            if (animator != null) {
                animator.cancel();
            }
            Animator loadAnimator = AnimatorInflater.loadAnimator(view.getContext(), C0966R.animator.f2549f);
            loadAnimator.setTarget(view);
            if (animatorListener != null) {
                loadAnimator.addListener(animatorListener);
            }
            loadAnimator.start();
            view.setTag(C0966R.C0970id.i8d, loadAnimator);
        }
    }

    /* renamed from: c */
    public static final void m89622c(View view, float f, float f2) {
        if (view != null && !C11171e.m11044a(14)) {
            Animator animator = (Animator) view.getTag(C0966R.C0970id.i8d);
            if (animator != null) {
                animator.cancel();
            }
            view.animate().cancel();
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }
    }
}

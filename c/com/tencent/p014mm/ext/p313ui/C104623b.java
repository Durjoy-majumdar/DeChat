package com.tencent.p014mm.ext.p313ui;

import android.animation.Animator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.tencent.p014mm.C0966R;
import p1005ma.C88718b;

/* renamed from: com.tencent.mm.ext.ui.b */
public class C104623b {

    /* renamed from: com.tencent.mm.ext.ui.b$a */
    public class C104624a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C104625b f310667d;

        public C104624a(C104625b bVar) {
            this.f310667d = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f310667d.mo21287a();
        }

        public void onAnimationEnd(Animator animator) {
            this.f310667d.onAnimationEnd();
        }

        public void onAnimationRepeat(Animator animator) {
            this.f310667d.mo21288b();
        }

        public void onAnimationStart(Animator animator) {
            this.f310667d.onAnimationStart();
        }
    }

    /* renamed from: com.tencent.mm.ext.ui.b$b */
    public interface C104625b {
        /* renamed from: a */
        void mo21287a();

        /* renamed from: b */
        void mo21288b();

        void onAnimationEnd();

        void onAnimationStart();
    }

    /* renamed from: a */
    public static final void m140236a(View view, long j, float f, float f2, C104625b bVar) {
        if (view != null) {
            Animator animator = (Animator) view.getTag(C0966R.C0970id.i8d);
            if (animator != null) {
                animator.cancel();
            }
            C88718b.m110681c("Changelcai", "[animTran] duration:%s x:%s", Long.valueOf(j), Float.valueOf(f));
            view.animate().cancel();
            view.animate().setListener((Animator.AnimatorListener) null);
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(view.getContext(), C0966R.C0968anim.f2435cy);
            if (bVar == null) {
                view.animate().setDuration(j).translationX(f).translationY(f2).setInterpolator(loadInterpolator);
            } else {
                view.animate().setDuration(j).translationX(f).translationY(f2).setInterpolator(loadInterpolator).setListener(new C104624a(bVar));
            }
        }
    }

    /* renamed from: b */
    public static final void m140237b(View view, float f, float f2) {
        if (view != null) {
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

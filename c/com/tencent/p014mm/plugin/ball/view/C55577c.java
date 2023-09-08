package com.tencent.p014mm.plugin.ball.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.ball.view.C55570b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.ball.view.c */
public class C55577c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C55570b.C55574d f158242d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f158243e;

    /* renamed from: f */
    public final /* synthetic */ View f158244f;

    /* renamed from: g */
    public final /* synthetic */ C55570b f158245g;

    public C55577c(C55570b bVar, C55570b.C55574d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f158245g = bVar;
        this.f158242d = dVar;
        this.f158243e = viewPropertyAnimator;
        this.f158244f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f158243e.setListener((Animator.AnimatorListener) null);
        View view = this.f158244f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f158244f.setTranslationX(0.0f);
        this.f158244f.setTranslationY(0.0f);
        this.f158245g.mo17319h(this.f158242d.f158231a);
        this.f158245g.f158223r.remove(this.f158242d.f158231a);
        this.f158245g.mo77094D();
    }

    public void onAnimationStart(Animator animator) {
        C55570b bVar = this.f158245g;
        RecyclerView.C16631z zVar = this.f158242d.f158231a;
        bVar.getClass();
    }
}

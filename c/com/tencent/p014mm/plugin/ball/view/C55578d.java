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

/* renamed from: com.tencent.mm.plugin.ball.view.d */
public class C55578d extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C55570b.C55574d f158246d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f158247e;

    /* renamed from: f */
    public final /* synthetic */ View f158248f;

    /* renamed from: g */
    public final /* synthetic */ C55570b f158249g;

    public C55578d(C55570b bVar, C55570b.C55574d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f158249g = bVar;
        this.f158246d = dVar;
        this.f158247e = viewPropertyAnimator;
        this.f158248f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f158247e.setListener((Animator.AnimatorListener) null);
        View view = this.f158248f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f158248f.setTranslationX(0.0f);
        this.f158248f.setTranslationY(0.0f);
        this.f158249g.mo17319h(this.f158246d.f158232b);
        this.f158249g.f158223r.remove(this.f158246d.f158232b);
        this.f158249g.mo77094D();
    }

    public void onAnimationStart(Animator animator) {
        C55570b bVar = this.f158249g;
        RecyclerView.C16631z zVar = this.f158246d.f158232b;
        bVar.getClass();
    }
}

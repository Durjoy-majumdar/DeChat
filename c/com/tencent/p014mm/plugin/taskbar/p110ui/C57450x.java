package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.taskbar.p110ui.C57440s;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.x */
public class C57450x extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C57440s.C57444d f164581d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f164582e;

    /* renamed from: f */
    public final /* synthetic */ View f164583f;

    /* renamed from: g */
    public final /* synthetic */ C57440s f164584g;

    public C57450x(C57440s sVar, C57440s.C57444d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f164584g = sVar;
        this.f164581d = dVar;
        this.f164582e = viewPropertyAnimator;
        this.f164583f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f164582e.setListener((Animator.AnimatorListener) null);
        View view = this.f164583f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f164583f.setTranslationX(0.0f);
        this.f164583f.setTranslationY(0.0f);
        this.f164584g.mo17319h(this.f164581d.f164553b);
        this.f164584g.f164545r.remove(this.f164581d.f164553b);
        this.f164584g.mo81038D();
    }

    public void onAnimationStart(Animator animator) {
        C57440s sVar = this.f164584g;
        RecyclerView.C16631z zVar = this.f164581d.f164553b;
        sVar.getClass();
    }
}

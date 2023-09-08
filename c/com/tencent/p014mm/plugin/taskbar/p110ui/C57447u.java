package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.u */
public class C57447u extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f164567d;

    /* renamed from: e */
    public final /* synthetic */ View f164568e;

    /* renamed from: f */
    public final /* synthetic */ ViewPropertyAnimator f164569f;

    /* renamed from: g */
    public final /* synthetic */ C57440s f164570g;

    public C57447u(C57440s sVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f164570g = sVar;
        this.f164567d = zVar;
        this.f164568e = view;
        this.f164569f = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        View view = this.f164568e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void onAnimationEnd(Animator animator) {
        this.f164569f.setListener((Animator.AnimatorListener) null);
        this.f164570g.mo17319h(this.f164567d);
        this.f164570g.f164542o.remove(this.f164567d);
        this.f164570g.mo81038D();
    }

    public void onAnimationStart(Animator animator) {
        this.f164570g.getClass();
    }
}

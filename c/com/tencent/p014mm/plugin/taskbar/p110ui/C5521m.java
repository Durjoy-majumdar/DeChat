package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.animation.Animator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.m */
public class C5521m implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C71331l f21368d;

    public C5521m(C71331l lVar) {
        this.f21368d = lVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f21368d.f206599b1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarAnimController$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f21368d.f206599b1.animate().setListener((Animator.AnimatorListener) null);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}

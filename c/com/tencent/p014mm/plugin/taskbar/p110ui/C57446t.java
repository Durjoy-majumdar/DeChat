package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.t */
public class C57446t extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f164563d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f164564e;

    /* renamed from: f */
    public final /* synthetic */ View f164565f;

    /* renamed from: g */
    public final /* synthetic */ C57440s f164566g;

    public C57446t(C57440s sVar, RecyclerView.C16631z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f164566g = sVar;
        this.f164563d = zVar;
        this.f164564e = viewPropertyAnimator;
        this.f164565f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f164564e.setListener((Animator.AnimatorListener) null);
        View view = this.f164565f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f164566g.mo91176x(this.f164563d);
        this.f164566g.f164544q.remove(this.f164563d);
        this.f164566g.mo81038D();
    }

    public void onAnimationStart(Animator animator) {
        this.f164566g.mo91174B(this.f164563d);
    }
}

package gy2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import gy2.C76079e;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gy2.j */
public class C76089j extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C76079e.C76083d f222992d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f222993e;

    /* renamed from: f */
    public final /* synthetic */ View f222994f;

    /* renamed from: g */
    public final /* synthetic */ C76079e f222995g;

    public C76089j(C76079e eVar, C76079e.C76083d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f222995g = eVar;
        this.f222992d = dVar;
        this.f222993e = viewPropertyAnimator;
        this.f222994f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f222993e.setListener((Animator.AnimatorListener) null);
        View view = this.f222994f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f222994f.setTranslationX(0.0f);
        this.f222994f.setTranslationY(0.0f);
        this.f222995g.mo17319h(this.f222992d.f222964b);
        this.f222995g.f222956r.remove(this.f222992d.f222964b);
        this.f222995g.mo106286D();
    }

    public void onAnimationStart(Animator animator) {
        C76079e eVar = this.f222995g;
        RecyclerView.C16631z zVar = this.f222992d.f222964b;
        eVar.getClass();
    }
}

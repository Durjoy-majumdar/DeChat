package gy2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gy2.f */
public class C76085f extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f222974d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f222975e;

    /* renamed from: f */
    public final /* synthetic */ View f222976f;

    /* renamed from: g */
    public final /* synthetic */ C76079e f222977g;

    public C76085f(C76079e eVar, RecyclerView.C16631z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f222977g = eVar;
        this.f222974d = zVar;
        this.f222975e = viewPropertyAnimator;
        this.f222976f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f222975e.setListener((Animator.AnimatorListener) null);
        View view = this.f222976f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f222977g.mo91176x(this.f222974d);
        this.f222977g.f222955q.remove(this.f222974d);
        this.f222977g.mo106286D();
    }

    public void onAnimationStart(Animator animator) {
        this.f222977g.mo91174B(this.f222974d);
    }
}

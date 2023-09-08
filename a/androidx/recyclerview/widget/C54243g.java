package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: androidx.recyclerview.widget.g */
public class C54243g extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f152247d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f152248e;

    /* renamed from: f */
    public final /* synthetic */ View f152249f;

    /* renamed from: g */
    public final /* synthetic */ C54234f f152250g;

    public C54243g(C54234f fVar, RecyclerView.C16631z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f152250g = fVar;
        this.f152247d = zVar;
        this.f152248e = viewPropertyAnimator;
        this.f152249f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f152248e.setListener((Animator.AnimatorListener) null);
        View view = this.f152249f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "androidx/recyclerview/widget/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f152250g.mo91176x(this.f152247d);
        this.f152250g.f152222q.remove(this.f152247d);
        this.f152250g.mo75013D();
    }

    public void onAnimationStart(Animator animator) {
        this.f152250g.mo91174B(this.f152247d);
    }
}

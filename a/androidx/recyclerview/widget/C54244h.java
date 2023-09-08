package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: androidx.recyclerview.widget.h */
public class C54244h extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f152251d;

    /* renamed from: e */
    public final /* synthetic */ View f152252e;

    /* renamed from: f */
    public final /* synthetic */ ViewPropertyAnimator f152253f;

    /* renamed from: g */
    public final /* synthetic */ C54234f f152254g;

    public C54244h(C54234f fVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f152254g = fVar;
        this.f152251d = zVar;
        this.f152252e = view;
        this.f152253f = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        View view = this.f152252e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "androidx/recyclerview/widget/DefaultItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void onAnimationEnd(Animator animator) {
        this.f152253f.setListener((Animator.AnimatorListener) null);
        this.f152254g.mo17319h(this.f152251d);
        this.f152254g.f152220o.remove(this.f152251d);
        this.f152254g.mo75013D();
    }

    public void onAnimationStart(Animator animator) {
        this.f152254g.getClass();
    }
}

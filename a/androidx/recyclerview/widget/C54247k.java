package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: androidx.recyclerview.widget.k */
public class C54247k extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C54234f.C54238d f152265d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f152266e;

    /* renamed from: f */
    public final /* synthetic */ View f152267f;

    /* renamed from: g */
    public final /* synthetic */ C54234f f152268g;

    public C54247k(C54234f fVar, C54234f.C54238d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f152268g = fVar;
        this.f152265d = dVar;
        this.f152266e = viewPropertyAnimator;
        this.f152267f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f152266e.setListener((Animator.AnimatorListener) null);
        View view = this.f152267f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "androidx/recyclerview/widget/DefaultItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f152267f.setTranslationX(0.0f);
        this.f152267f.setTranslationY(0.0f);
        this.f152268g.mo17319h(this.f152265d.f152231b);
        this.f152268g.f152223r.remove(this.f152265d.f152231b);
        this.f152268g.mo75013D();
    }

    public void onAnimationStart(Animator animator) {
        C54234f fVar = this.f152268g;
        RecyclerView.C16631z zVar = this.f152265d.f152231b;
        fVar.getClass();
    }
}

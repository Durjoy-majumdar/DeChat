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

/* renamed from: androidx.recyclerview.widget.j */
public class C54246j extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C54234f.C54238d f152261d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f152262e;

    /* renamed from: f */
    public final /* synthetic */ View f152263f;

    /* renamed from: g */
    public final /* synthetic */ C54234f f152264g;

    public C54246j(C54234f fVar, C54234f.C54238d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f152264g = fVar;
        this.f152261d = dVar;
        this.f152262e = viewPropertyAnimator;
        this.f152263f = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f152262e.setListener((Animator.AnimatorListener) null);
        View view = this.f152263f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "androidx/recyclerview/widget/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f152263f.setTranslationX(0.0f);
        this.f152263f.setTranslationY(0.0f);
        this.f152264g.mo17319h(this.f152261d.f152230a);
        this.f152264g.f152223r.remove(this.f152261d.f152230a);
        this.f152264g.mo75013D();
    }

    public void onAnimationStart(Animator animator) {
        C54234f fVar = this.f152264g;
        RecyclerView.C16631z zVar = this.f152261d.f152230a;
        fVar.getClass();
    }
}

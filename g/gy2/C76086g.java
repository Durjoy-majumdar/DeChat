package gy2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: gy2.g */
public class C76086g extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f222978d;

    /* renamed from: e */
    public final /* synthetic */ View f222979e;

    /* renamed from: f */
    public final /* synthetic */ ViewPropertyAnimator f222980f;

    /* renamed from: g */
    public final /* synthetic */ C76079e f222981g;

    public C76086g(C76079e eVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f222981g = eVar;
        this.f222978d = zVar;
        this.f222979e = view;
        this.f222980f = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f222979e.setScaleX(1.0f);
        this.f222979e.setScaleY(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f222980f.setListener((Animator.AnimatorListener) null);
        this.f222981g.mo17319h(this.f222978d);
        this.f222981g.f222953o.remove(this.f222978d);
        this.f222981g.mo106286D();
    }

    public void onAnimationStart(Animator animator) {
        this.f222981g.getClass();
    }
}

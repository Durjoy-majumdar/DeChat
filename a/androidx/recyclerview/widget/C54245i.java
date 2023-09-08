package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
public class C54245i extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f152255d;

    /* renamed from: e */
    public final /* synthetic */ int f152256e;

    /* renamed from: f */
    public final /* synthetic */ View f152257f;

    /* renamed from: g */
    public final /* synthetic */ int f152258g;

    /* renamed from: h */
    public final /* synthetic */ ViewPropertyAnimator f152259h;

    /* renamed from: i */
    public final /* synthetic */ C54234f f152260i;

    public C54245i(C54234f fVar, RecyclerView.C16631z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f152260i = fVar;
        this.f152255d = zVar;
        this.f152256e = i;
        this.f152257f = view;
        this.f152258g = i2;
        this.f152259h = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f152256e != 0) {
            this.f152257f.setTranslationX(0.0f);
        }
        if (this.f152258g != 0) {
            this.f152257f.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f152259h.setListener((Animator.AnimatorListener) null);
        this.f152260i.mo91175w(this.f152255d);
        this.f152260i.f152221p.remove(this.f152255d);
        this.f152260i.mo75013D();
    }

    public void onAnimationStart(Animator animator) {
        this.f152260i.mo91178z(this.f152255d);
    }
}

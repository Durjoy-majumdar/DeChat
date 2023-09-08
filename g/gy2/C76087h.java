package gy2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: gy2.h */
public class C76087h extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f222982d;

    /* renamed from: e */
    public final /* synthetic */ int f222983e;

    /* renamed from: f */
    public final /* synthetic */ View f222984f;

    /* renamed from: g */
    public final /* synthetic */ int f222985g;

    /* renamed from: h */
    public final /* synthetic */ ViewPropertyAnimator f222986h;

    /* renamed from: i */
    public final /* synthetic */ C76079e f222987i;

    public C76087h(C76079e eVar, RecyclerView.C16631z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f222987i = eVar;
        this.f222982d = zVar;
        this.f222983e = i;
        this.f222984f = view;
        this.f222985g = i2;
        this.f222986h = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f222983e != 0) {
            this.f222984f.setTranslationX(0.0f);
        }
        if (this.f222985g != 0) {
            this.f222984f.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f222986h.setListener((Animator.AnimatorListener) null);
        this.f222987i.mo91175w(this.f222982d);
        this.f222987i.f222954p.remove(this.f222982d);
        this.f222987i.mo106286D();
    }

    public void onAnimationStart(Animator animator) {
        this.f222987i.mo91178z(this.f222982d);
    }
}

package u92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: u92.g */
public final class C65250g extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C65238a f187846d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView.C16631z f187847e;

    /* renamed from: f */
    public final /* synthetic */ int f187848f;

    /* renamed from: g */
    public final /* synthetic */ View f187849g;

    /* renamed from: h */
    public final /* synthetic */ int f187850h;

    /* renamed from: i */
    public final /* synthetic */ ViewPropertyAnimator f187851i;

    public C65250g(C65238a aVar, RecyclerView.C16631z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f187846d = aVar;
        this.f187847e = zVar;
        this.f187848f = i;
        this.f187849g = view;
        this.f187850h = i2;
        this.f187851i = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        C87412m.m108594g(animator, "animator");
        if (this.f187848f != 0) {
            this.f187849g.setTranslationX(0.0f);
        }
        if (this.f187850h != 0) {
            this.f187849g.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f187851i.setListener((Animator.AnimatorListener) null);
        this.f187846d.mo91175w(this.f187847e);
        this.f187846d.f187798t.remove(this.f187847e);
        this.f187846d.mo89368F();
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f187846d.mo91178z(this.f187847e);
    }
}

package p902gm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: gm.b */
public class C75987b extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f222816d;

    /* renamed from: e */
    public final /* synthetic */ int f222817e;

    /* renamed from: f */
    public final /* synthetic */ View f222818f;

    /* renamed from: g */
    public final /* synthetic */ int f222819g;

    /* renamed from: h */
    public final /* synthetic */ ViewPropertyAnimator f222820h;

    /* renamed from: i */
    public final /* synthetic */ C75979a f222821i;

    public C75987b(C75979a aVar, RecyclerView.C16631z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f222821i = aVar;
        this.f222816d = zVar;
        this.f222817e = i;
        this.f222818f = view;
        this.f222819g = i2;
        this.f222820h = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f222817e != 0) {
            this.f222818f.setTranslationX(0.0f);
        }
        if (this.f222819g != 0) {
            this.f222818f.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f222820h.setListener((Animator.AnimatorListener) null);
        this.f222821i.mo91175w(this.f222816d);
        this.f222821i.f222788p.remove(this.f222816d);
        this.f222821i.mo106200F();
    }

    public void onAnimationStart(Animator animator) {
        this.f222821i.mo91178z(this.f222816d);
    }
}

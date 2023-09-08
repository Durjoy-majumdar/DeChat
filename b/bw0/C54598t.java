package bw0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.ball.view.C55570b;

/* renamed from: bw0.t */
public class C54598t extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f153100d;

    /* renamed from: e */
    public final /* synthetic */ int f153101e;

    /* renamed from: f */
    public final /* synthetic */ View f153102f;

    /* renamed from: g */
    public final /* synthetic */ int f153103g;

    /* renamed from: h */
    public final /* synthetic */ ViewPropertyAnimator f153104h;

    /* renamed from: i */
    public final /* synthetic */ C55570b f153105i;

    public C54598t(C55570b bVar, RecyclerView.C16631z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f153105i = bVar;
        this.f153100d = zVar;
        this.f153101e = i;
        this.f153102f = view;
        this.f153103g = i2;
        this.f153104h = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f153101e != 0) {
            this.f153102f.setTranslationX(0.0f);
        }
        if (this.f153103g != 0) {
            this.f153102f.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f153104h.setListener((Animator.AnimatorListener) null);
        this.f153105i.mo91175w(this.f153100d);
        this.f153105i.f158221p.remove(this.f153100d);
        this.f153105i.mo77094D();
    }

    public void onAnimationStart(Animator animator) {
        this.f153105i.mo91178z(this.f153100d);
    }
}

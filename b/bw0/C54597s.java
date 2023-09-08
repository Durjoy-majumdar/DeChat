package bw0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.ball.view.C55570b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: bw0.s */
public class C54597s extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f153096d;

    /* renamed from: e */
    public final /* synthetic */ View f153097e;

    /* renamed from: f */
    public final /* synthetic */ ViewPropertyAnimator f153098f;

    /* renamed from: g */
    public final /* synthetic */ C55570b f153099g;

    public C54597s(C55570b bVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f153099g = bVar;
        this.f153096d = zVar;
        this.f153097e = view;
        this.f153098f = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        View view = this.f153097e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void onAnimationEnd(Animator animator) {
        this.f153098f.setListener((Animator.AnimatorListener) null);
        this.f153099g.mo17319h(this.f153096d);
        this.f153099g.f158220o.remove(this.f153096d);
        this.f153099g.mo77094D();
    }

    public void onAnimationStart(Animator animator) {
        this.f153099g.getClass();
    }
}

package bw0;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.ball.view.C55570b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: bw0.r */
public class C54596r implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f153092d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f153093e;

    /* renamed from: f */
    public final /* synthetic */ View f153094f;

    /* renamed from: g */
    public final /* synthetic */ C55570b f153095g;

    public C54596r(C55570b bVar, RecyclerView.C16631z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f153095g = bVar;
        this.f153092d = zVar;
        this.f153093e = viewPropertyAnimator;
        this.f153094f = view;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f153093e.setListener((Animator.AnimatorListener) null);
        View view = this.f153094f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f153095g.mo91176x(this.f153092d);
        this.f153095g.f158222q.remove(this.f153092d);
        this.f153095g.mo77094D();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f153095g.mo91174B(this.f153092d);
    }
}

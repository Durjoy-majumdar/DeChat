package u92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: u92.b */
public final class C65245b extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C65238a f187824d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView.C16631z f187825e;

    /* renamed from: f */
    public final /* synthetic */ View f187826f;

    /* renamed from: g */
    public final /* synthetic */ ViewPropertyAnimator f187827g;

    public C65245b(C65238a aVar, RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f187824d = aVar;
        this.f187825e = zVar;
        this.f187826f = view;
        this.f187827g = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        C87412m.m108594g(animator, "animator");
        View view = this.f187826f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator$animateAddImpl$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitask/ui/minusscreen/animation/MinusAnimator$animateAddImpl$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f187827g.setListener((Animator.AnimatorListener) null);
        this.f187824d.mo17319h(this.f187825e);
        this.f187824d.f187797s.remove(this.f187825e);
        this.f187824d.mo89368F();
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f187824d.getClass();
    }
}
